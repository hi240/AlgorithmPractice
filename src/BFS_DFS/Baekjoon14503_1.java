package BFS_DFS;

import java.util.Scanner;

//로봇 청소기
public class Baekjoon14503_1 {
	public static int[][] map;
	public static boolean[][] visit;
	public static int n;
	public static int m;
	public static int[] rx= {-1,0,1,0};
	public static int[] ry= {0,1,0,-1};
	public static int sum;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		m= sc.nextInt();
		int r= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		map=new int[n][m];
		visit=new boolean[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		clean(r,c,d);
		System.out.println(sum);
	}
	public static void clean(int r,int c,int d) {
		boolean bool = false;
		if(!visit[r][c]) {
			visit[r][c]=true;
			sum++;
		}
		for(int i=0;i<4;i++) {
			//회전
			d=rotate(d);
			//전진
			int r_ = r+rx[d];
			int c_ = c+ry[d];
			if(map[r_][c_]==0&&!visit[r_][c_]) {
				clean(r_,c_,d);
				bool=true;
				break;
			}
		}
		//후진타임
		if(!bool) {
			int br=r-rx[d];
			int bc=c-ry[d];
			if(map[br][bc]==0) {
				clean(br,bc,d);
			}
		}
	}
	public static int rotate(int d) {
		if(d==0) {//북
			return 3;
		}else if(d==1) { //동
			return 0;
		}else if(d==2) { //남
			return 1;
		}else { //서
			return 2;
		}
	}
}
