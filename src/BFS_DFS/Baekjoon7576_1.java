package BFS_DFS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*  6 4
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1  */
//≈‰∏∂≈‰
public class Baekjoon7576_1 {
	static int N,M;
	static int[][] graph;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		M= Integer.parseInt(st.nextToken());
		N= Integer.parseInt(st.nextToken());
		graph = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<M;j++) {
				graph[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		bfs();
		
	}
	public static void bfs() {
		int[] x = {1,0,-1,0};
		int[] y = {0,1,0,-1};
		Queue<LOC> que = new LinkedList<LOC>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(graph[i][j]==1) {
					que.add(new LOC(i,j));
				}
			}
		}
		while(!que.isEmpty()) {
			LOC loc = que.poll(); 
			for(int i=0;i<4;i++) {
				int _x=loc.x+x[i];
				int _y=loc.y+y[i];
				if(_x>=0&&_y>=0&&_x<N&&_y<M) {
					if(graph[_x][_y]==0) {
						graph[_x][_y]= graph[loc.x][loc.y]+1;
						que.add(new LOC(_x,_y));
					}
				}
			}
		}
		int max=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(graph[i][j]==0) {
					System.out.println(-1);
					System.exit(0);
				}
				if(max<graph[i][j]) {
					max=graph[i][j];
				}
			}
		}
		System.out.println(max-1);
	}
}
class LOC {
	int x;
	int y;
	LOC(int x,int y) {
		this.x=x;
		this.y=y;
	}
}