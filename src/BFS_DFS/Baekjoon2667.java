package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//단지번호붙이기 (DFS)
public class Baekjoon2667 {
	static int N;
	static int[][] map;
	static boolean[][] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		map= new int[N+1][N+1];
		visit = new boolean[N+1][N+1];
		for(int i=0;i<N;i++) {
			String[] str = br.readLine().split("");
			for(int j=0;j<str.length;j++) {
				map[i][j]=Integer.parseInt(str[j]);
			}
		}
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(check(i,j)) {
					int a=dfs(i,j);
					list.add(a);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}
	public static boolean check(int i,int j) {
		if(i<0||j<0||i>N||j>N) return false; 
		if(map[i][j]==0||visit[i][j]==true) return false;
		return true;
	}
	public static int dfs(int i,int j) {
		int count=1;
		visit[i][j]=true;
		if(check(i+1,j)) count += dfs(i+1,j);
		if(check(i-1,j)) count += dfs(i-1,j);
		if(check(i,j+1)) count += dfs(i,j+1);
		if(check(i,j-1)) count += dfs(i,j-1);
		return count;
	}
}
//StringTokenizer로 한글자씩 불러오는건 안되는구나..