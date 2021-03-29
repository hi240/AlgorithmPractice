package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//나이트의 이동
class CHS{
	int x;
	int y;
	int score;
	CHS(int x,int y,int score){
		this.x=x;
		this.y=y;
		this.score=score;
	}
}
public class Baekjoon7562 {
	static int testnum;
	static int l;
	static int from_x,from_y;
	static int to_x,to_y;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		testnum= Integer.parseInt(st.nextToken());
		
		for(int i=0;i<testnum;i++) {
			st = new StringTokenizer(br.readLine()," ");
			l= Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine()," ");
			from_x= Integer.parseInt(st.nextToken());
			from_y= Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine()," ");
			to_x= Integer.parseInt(st.nextToken());
			to_y= Integer.parseInt(st.nextToken());
			if(from_x==to_x&&from_y==to_y) {
				System.out.println("0");
			}else {
				bfs();
			}
		}
	}
	public static void bfs() {
		int[][] map= new int[l][l];
		boolean[][] visit = new boolean[l][l];
		int[] _x= {2,1,-1,-2,-2,-1,1,2};
		int[] _y= {1,2,2,1,-1,-2,-2,-1};
		Queue<CHS> que = new LinkedList<CHS>();
		que.offer(new CHS(from_x,from_y,0));
		visit[from_x][from_y]=true;
		while(!que.isEmpty()) {
			CHS xy=que.poll();
			for(int i=0;i<8;i++) {
				int x=_x[i]+xy.x;
				int y=_y[i]+xy.y;
				if(x==to_x&&y==to_y) {
					System.out.println(xy.score+1);
					return;
				}
				if(x>=0&&y>=0&&x<l&&y<l) {
					if(!visit[x][y]) {
						visit[x][y]=true;
						que.offer(new CHS(x,y,xy.score+1));
					}
				}
			}
		}
	}
}



