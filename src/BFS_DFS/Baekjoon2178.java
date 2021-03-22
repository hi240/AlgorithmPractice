package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//¹Ì·Î Å½»ö
public class Baekjoon2178 {
	static int N;
	static int M;
	static int[][] graph;
	static boolean[][] visit;
	static int x,y;
	static int count;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N= Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		graph = new int[N][M];
		visit = new boolean[N][M];
		for(int i=0;i<N;i++) {
			String[] arr =br.readLine().split("");
			for(int j=0;j<M;j++) {
				graph[i][j]=Integer.parseInt(arr[j]);
			}
		}
		bfs();
		System.out.println(graph[N-1][M-1]);
		
	}
	public static void bfs() {
		
		int[] arr_x= {1,0,-1,0};
		int[] arr_y= {0,1,0,-1};
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		qx.add(0);
		qy.add(0);
		int x =0;
		int y =0;
		
		while(!qx.isEmpty()&&!qy.isEmpty()){
			x=qx.poll();
			y=qy.poll();
			for(int i=0;i<4;i++) {
				int _x = x+arr_x[i];
				int _y = y+arr_y[i];
					if(_x>=0&&_y>=0&&_x<N&&_y<M) {
						if(graph[_x][_y]==1&&!visit[_x][_y]) {
							visit[_x][_y] = true;
							qx.add(_x);
							qy.add(_y);
							graph[_x][_y]=graph[x][y]+1;
						}
					}
			}
		}
		
	}
}