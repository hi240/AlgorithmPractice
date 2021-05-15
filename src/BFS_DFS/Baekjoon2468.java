package BFS_DFS;

import java.util.Scanner;

//안전 영역
public class Baekjoon2468 {
	public static int[][] graph;
	public static boolean[][] check;
	public static int[] score;
	public static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		graph = new int[n][n];
		check = new boolean[n][n];
		score = new int[n+1];
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			String[] str=s.split(" ");
			for(int j=0;j<str.length;j++) {
				graph[i][j]=Integer.parseInt(str[j]);
			}
		}
		dfs(0,0,3,0);
		for(int i=1;i<n+1;i++) {
			System.out.println(score[i]);
		}
	}
	public static void dfs(int x,int y,int depth,int sum) {
		if(x<0||x>=n||y<0||y>=n) return;
		if(graph[x][y]>depth&&!check[x][y]) {
			check[x][y]=true;
			dfs(x+1,y,depth,sum);
			dfs(x,y+1,depth,sum);
			dfs(x-1,y,depth,sum);
			dfs(x,y-1,depth,sum);
		}
		sum+=1;
		score[depth]=sum;
		
	}
}
