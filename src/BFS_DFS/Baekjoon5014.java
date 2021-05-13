package BFS_DFS;

import java.util.Scanner;
import java.util.StringTokenizer;

//½ºÅ¸Æ®¸µÅ©
public class Baekjoon5014 {
	public static int f;
	public static int g;
	public static int u;
	public static int d;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		//f: Ãþ ¼ö  s:³»°¡ÀÖ´Â °÷   g:°¡¾ßÇÏ´Â Ãþ   u:À§·Î uÃþ   d:¹ØÀ¸·Î dÃþ
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
		if(s+u<=g) {
			if(s+u==s) {
				System.out.println("use the stairs");
				return;
			}
			dfs(s+u,count+1);
			return;
		}
		if(s-d>=1) {
			if(s-d==s) {
				System.out.println("use the stairs");
				return;
			}
			dfs(s-d,count+1);
			return;
		}
		
		System.out.println("use the stairs");
		return;
	}
}
