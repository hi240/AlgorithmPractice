package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//토마토 (2번째푸는중)
public class Baekjoon7576 {
	public static int[][] map;
	public static Queue<x_y> q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n= sc.nextInt();
		map = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==1) {
					q.add(new x_y(i,j));
				}
			}
		}
		bfs();
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==0) {
					System.out.println(-1);
					System.exit(0);
				}
				if(map[i][j]>max) max=map[i][j];
			}
		}
		if(max==1)System.out.println(0);
		else System.out.println(max-1);
	}
	public static void bfs() {
		int[] dx= {1,0,-1,0};
		int[] dy= {0,1,0,-1};
		while(!q.isEmpty()) {
			x_y xy=q.poll();
			for(int i=0;i<4;i++) {
				int _x=xy.x+dx[i];
				int _y=xy.y+dy[i];
				if(check(_x,_y)&&map[_x][_y]==0) {
					q.add(new x_y(_x,_y));
					map[_x][_y]=map[xy.x][xy.y]+1;
				}
			}
		}
	}
	public static boolean check(int x,int y) {
		if(x<0||y<0||x>=map.length||y>=map[0].length) return false;
		return true;
	}
}
class x_y{
	int x;
	int y;
	x_y(int x,int y){
		this.x=x;
		this.y=y;
	}
}