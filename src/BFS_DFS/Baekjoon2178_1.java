package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//¹Ì·ÎÅ½»ö
public class Baekjoon2178_1 {
	static int N,M;
	static int[][] graph;
	static boolean[][] visit;
	public static void main(String[] args) throws IOException{

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
		int[] _x= {1,0,-1,0};
		int[] _y= {0,1,0,-1};
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		qx.add(0);
		qy.add(0);
		visit[0][0]=true;
		int x =0;
		int y =0;
		
		while(!qx.isEmpty()&&!qy.isEmpty()) {
			x=qx.poll();
			y=qy.poll();
			for(int i=0;i<4;i++) {
				int newx= x+ _x[i];
				int newy= y+ _y[i];
				if(newx>=0&&newy>=0&&newx<N&&newy<M) {
					if(graph[newx][newy]==1&&!visit[newx][newy]) {
						qx.add(newx);
						qy.add(newy);
						graph[newx][newy] = graph[x][y]+1;
					}
				}
			}
			
		}
		
	}
}
