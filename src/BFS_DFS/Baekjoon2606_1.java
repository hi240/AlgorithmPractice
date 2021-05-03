package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
//바이러스 복습
public class Baekjoon2606_1 {
	public static int count=0;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int node = Integer.parseInt(st.nextToken());
		boolean[] visited = new boolean[number+1];
		List<Integer>[] graph =new ArrayList[number+1];
		for(int i=0;i<number+1;i++) {
			graph[i]=new ArrayList<>();
		}
		for(int i=0;i<node;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}
		bfs(visited,graph,1);
		System.out.println(count-1);
	}
	public static void bfs(boolean[] visited,List<Integer>[] graph,int n) {
		if(!visited[n]) {
			count++;
			visited[n]=true;
			for(int i:graph[n]) {
				bfs(visited,graph,i);
			}
		}
	}
}
