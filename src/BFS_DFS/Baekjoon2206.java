package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
//벽 부수고 이동하기
public class Baekjoon2206 {
	static int N;
	static int M;
	static int[][] graph;
	static int[][] score;
	static boolean[][] visit;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str =br.readLine().split(" ");
		N= Integer.parseInt(str[0]);
		M= Integer.parseInt(str[1]);
		graph = new int[N][M];
		visit = new boolean[N][M];
		score = new int[N][M];
		for(int i=0;i<N;i++) {
			String[] arr =br.readLine().split("");
			for(int j=0;j<M;j++) {
				graph[i][j]=Integer.parseInt(arr[j]);
			}
		}
		bfs();
		
	}
	public static void bfs() {
		int[] _x= {1,0,-1,0};
		int[] _y= {0,1,0,-1};
		Queue<XY> que = new LinkedList<XY>();
		que.add(new XY(0,0));
		int j=0;
		visit[0][0]=true;
		while(!que.isEmpty()) {
			XY xy = que.poll();
			for(int i=0;i<4;i++) {
				int x = xy.x+_x[i];
				int y = xy.y+_y[i];
				if(x>=0&&y>=0&&x<N&&y<M&&!visit[x][y]) {
					if(graph[x][y]==1&&j==1) continue;
					else if(graph[x][y]==1&&j==0) { 
						j=1;
					}
					visit[x][y]=true;
					que.add(new XY(x,y));
					score[x][y]=score[xy.x][xy.y]+1;
				}
			} 
		}
		for(int l=0;l<N;l++) { //for testing
			for(int k=0;k<M;k++) {
				System.out.print(score[l][k]);
			}
			System.out.println();
		}
		System.out.println(score[N-1][M-1]);
	}	
}
class XY{
	int x;
	int y;
	XY(int x,int y){
		x=this.x;
		y=this.y;
	}
}
