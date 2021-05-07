package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//ÃÌ¼ö°è»ê
public class Baekjoon2644 {
	public static ArrayList<Integer>[] arr;
	public static boolean[] visited;
	public static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(br.readLine());
		arr =new ArrayList[sum+1];
		visited = new boolean[sum+1];
		for(int i=0;i<=sum;i++) {
			arr[i]=new ArrayList<Integer>();
		}
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		for(int i=0;i<cnt;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x].add(y);
			arr[y].add(x);
		}
		dfs(num1,num2,0);
		if(count==0) {
			System.out.println(-1);
		}else{
			System.out.println(count);
		}
		}
	public static void dfs(int from,int to,int depth) {
		if(from==to) {
			count=depth;
			return;
		}
		for(int i:arr[from]) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(i,to,depth+1);
				visited[i]=false;
			}
		}
		
	}
}
