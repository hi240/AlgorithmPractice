package BFS_DFS;

import java.util.Scanner;

//맥주 마시면서 걸어가기
public class Baekjoon9205 {
	public static String a;
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int t= sc.nextInt(); 
		for(int i=0;i<t;i++) {
			a="";
			int n=sc.nextInt();
			int[][] map=new int[n+2][2];
			for(int j=0;j<n+2;j++) {
				map[j][0]=sc.nextInt();
				map[j][1]=sc.nextInt();
			}
			dfs(map,0,map[0][0],map[0][1]);
			System.out.println(a);
		}
	}
	public static void dfs(int[][] map,int depth,int x,int y) {
//		if(depth==map.length) {
//			return;
//		}
		if(x==map[map.length-1][0]&&y==map[map.length-1][1]) {
			a="happy";
			return;
		}
		if(Math.abs(map[depth+1][0]-x)+Math.abs(map[depth+1][1]-y)>1000) {
			a="sad";
			return;
		}else {
			dfs(map,depth+1,map[depth+1][0],map[depth+1][1]);
		}
		
	}
}
