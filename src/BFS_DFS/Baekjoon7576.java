package BFS_DFS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//토마토
public class Baekjoon7576 {
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
		Queue<DT> que = new LinkedList<DT>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) { //0이 하나라도 잇으면 됨.
				if(graph[i][j]==1) {
					que.add(new DT(i,j));
				}
			}
		}
		while(!que.isEmpty()) {
			DT dot = que.poll();
			for(int i=0;i<4;i++) {
				int _x = dot.x+x[i];
				int _y = dot.y+y[i];
				if(_x<0||_y<0||_x>=N||_y>=N) {
					continue;
				}
				if(graph[_x][_y]!=0) {
					continue;
				}
				graph[_x][_y]=graph[dot.x][dot.y]+1;
				que.add(new DT(_x,_y));
			}
		}
		int max=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(graph[i][j]==0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, graph[i][j]);
			}
		}
		System.out.println(max-1);
	}
//	 public static void print(int[][] arr, int N, int M) {
//	        for (int i = 0; i < N; i++) {
//	            for (int j = 0; j < M; j++) {
//	                System.out.print(arr[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
//	    }
}
class DT{
	int x;
	int y;
	DT(int x,int y){
		x=this.x;
		y=this.y;
	}
}