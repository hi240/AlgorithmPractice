package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//≈‰∏∂≈‰2(BFS)
public class Baekjoon7569 {
	public static int[][][] graph;
	public static int M;
	public static int N;
	public static int H;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		graph = new int [H][N][M];
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int k=0;k<M;k++) {
					graph[i][j][k]=Integer.parseInt(st.nextToken());
				}
			}
		}
		BFS();
	}
	public static void BFS() {
		int[] _x= {1,0,0,-1,0,0};
		int[] _y= {0,1,0,0,-1,0};
		int[] _z= {0,0,1,0,0,-1};
		Queue<XYZ> que = new LinkedList<XYZ>();
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(graph[i][j][k]==1) { 
						que.add(new XYZ(i,j,k));
					}
				}
			}
		}
		while(!que.isEmpty()) {
			XYZ xyz= que.poll();
			for(int i=0;i<6;i++) {
				int x = xyz.x+_x[i];
				int y = xyz.y+_y[i];
				int z = xyz.z+_z[i];
				if(x>=0&&y>=0&&z>=0&&x<H&&y<N&&z<M) {
					if(graph[x][y][z]==0) {
						graph[x][y][z]=graph[xyz.x][xyz.y][xyz.z]+1;
						que.add(new XYZ(x,y,z));
					}
				}
			}
		}
		int max=0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(max<graph[i][j][k]) {
						max=graph[i][j][k];
					}
					if(graph[i][j][k]==0) {
						System.out.println("-1");
						return;
					}
				}
			}
		}
		System.out.println(max-1);
	}
	
}
class XYZ{
	int x;
	int y;
	int z;
	XYZ(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
}