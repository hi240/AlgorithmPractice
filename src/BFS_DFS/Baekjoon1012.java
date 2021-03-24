package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//¿Ø±‚≥Û πË√ﬂ(DFS)
public class Baekjoon1012 {
	static int M;
	static int N;
	static int num;
	static boolean[][] field;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int testcase = Integer.parseInt(st.nextToken());
		
		for(int l=0;l<testcase;l++) {
			st = new StringTokenizer(br.readLine()," ");
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			field = new boolean[M][N];
			for(int i=0;i<num;i++) {
				st = new StringTokenizer(br.readLine()," ");
				int m = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				field[m][n]=true;
			}
			int sum=0;
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					if(valid(i,j)) {
						dfs(i,j);
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
		
	}
	public static void dfs(int m,int n) {
		field[m][n]=!field[m][n];
		if (valid(m+1,n)) dfs(m+1,n);
		if (valid(m-1,n)) dfs(m-1,n);
		if (valid(m,n+1)) dfs(m,n+1);
		if (valid(m,n-1)) dfs(m,n-1);
	}
	
	public static boolean valid(int i,int j) {
		if(i<0||j<0||i>=M||j>=N) return false;
		if(!field[i][j]) return false;
		return true;
	}
}
