package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

//벽 부수고 이동하기
class state{
	int x;
	int y;
	int score;
	int wall;
	state(int x,int y,int score,int wall) {
		this.x=x;
		this.y=y;
		this.score=score;
		this.wall=wall;
	}
}
public class Baekjoon2206_1 {
	static int N,M;
	static int[][] graph;
	static boolean[][][] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str =br.readLine().split(" ");
		N= Integer.parseInt(str[0]);
		M= Integer.parseInt(str[1]);
		graph = new int[N][M];
		visit = new boolean[N][M][2];
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
		Queue<state> que = new LinkedList<state>();
		que.add(new state(0,0,1,0));
		visit[0][0][1]=true;
		visit[0][0][0]=true;
		
		while(!que.isEmpty()) {
			state st = que.poll();
			if(st.x==N-1&&st.y==M-1) {
				System.out.println(st.score);
				return;
			}
			for(int i=0;i<4;i++) {
				int x=st.x+_x[i];
				int y=st.y+_y[i];
				if(x>=0&&y>=0&&x<N&&y<M) {
					if(graph[x][y]==1&&!visit[x][y][1]&&st.wall==0) {
						visit[x][y][1]=true;
						que.add(new state(x,y,st.score+1,1));
					}else if(graph[x][y]==0&&!visit[x][y][st.wall]) {
						visit[x][y][st.wall]=true;
						que.add(new state(x,y,st.score+1,st.wall));
					}
				}
			}
		}
		System.out.println("-1");
	}
}

