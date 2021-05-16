package BFS_DFS;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//안전 영역
public class Baekjoon2468_1 {
	public static int[][] graph;
	public static int n;
	public static int[] dx= {1,0,-1,0};
	public static int[] dy= {0,1,0,-1};
	public static int max;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		graph = new int[n][n];
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			String[] str=s.split(" ");
			for(int j=0;j<str.length;j++) {
				graph[i][j]=Integer.parseInt(str[j]);
				set.add(graph[i][j]);
			}
		}
		Iterator<Integer> iter= set.iterator();
		max=1;
		while(iter.hasNext()) {
			func(iter.next());
		}
		System.out.println(max);
		
	}
	public static void func(int level) {
		boolean[][] check = new boolean[n][n];
		int count=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(graph[i][j]>level&&!check[i][j]) {
					dfs(i,j,level,check);
					count++;
				}
			}
		}
		
		max=Math.max(max, count);
	}
	public static void dfs(int x,int y,int level,boolean[][] check) {
		if(check[x][y]||graph[x][y]<=level) return;
		check[x][y]=true;
		for(int i=0;i<4;i++) {
			int _x=x+dx[i];
			int _y=y+dy[i];
			if(_x<0||_y<0||_x>=n||_y>=n) continue;
			dfs(_x,_y,level,check);
		}
	}
}
