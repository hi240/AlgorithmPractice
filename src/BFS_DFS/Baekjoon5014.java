package BFS_DFS;

import java.util.Scanner;
import java.util.StringTokenizer;

//스타트링크 (DFS시간초과)
public class Baekjoon5014 {
	public static int f;
	public static int g;
	public static int u;
	public static int d;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		//f: 층 수  s:내가있는 곳   g:가야하는 층   u:위로 u층   d:밑으로 d층
		f = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		g = Integer.parseInt(st.nextToken());
		u = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		dfs(s,0);
	}
	public static void dfs(int s,int count) {
		if(s==g) {
			System.out.println(count);
			System.exit(0);
		}
		if(s+u<=f&&u!=0) {
			dfs(s+u,count+1);
			return;
		}
		if(s-d>=1&&d!=0) {
			dfs(s-d,count+1);
			return;
		}
		System.out.println("use the stairs");
		System.exit(0);
	}
}
