package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//이분 그래프
public class Baekjoon1707_1 {
	static ArrayList<Integer>[] graph;
	static int[] visit;
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int testnum= Integer.parseInt(st.nextToken());
		
		for(int i=0;i<testnum;i++){
			st= new StringTokenizer(br.readLine());
			int V=Integer.parseInt(st.nextToken());
			int E=Integer.parseInt(st.nextToken());
			graph=new ArrayList[V+1];
			for(int j=0;j<graph.length;j++) {
				graph[j]= new ArrayList<Integer>();
			}
			visit=new int[V+1];
			for(int j=0;j<E;j++) {
				st= new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x].add(y);
				graph[y].add(x);
			}
			bfs(V,E);
		}
	}
	public static void bfs(int V,int E) {
		Queue<Integer> que = new LinkedList<>();
		for(int i=1;i<=V;i++) {
			if(visit[i]==0) { 
				que.offer(i);
				visit[i]=1;
			}
			while(!que.isEmpty()) {
				int now=que.poll();
				for(int j=0;j<graph[now].size();j++) {
					if(visit[graph[now].get(j)]==0) {
						que.offer(graph[now].get(j));
					}
					if(visit[graph[now].get(j)]==0&&visit[now]==1) {
						visit[graph[now].get(j)]=2;
					}else if(visit[graph[now].get(j)]==0&&visit[now]==2) {
						visit[graph[now].get(j)]=1;
					}
					if(visit[graph[now].get(j)]==visit[now]) {
						System.out.println("NO");
						return;
					}
				}
			}
		}
		System.out.println("YES");
	}
}
