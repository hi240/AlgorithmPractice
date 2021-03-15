package BFS;
//DFS¿Í BFS

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon1260 {
	static int N,M,V;
	static int x,y;
	static boolean[] visit;
	static ArrayList<Integer>[] graph;
	static ArrayList<Integer> bfs;
	static ArrayList<Integer> dfs;
	static Queue<Integer> que;
	static Stack<Integer> stk;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		
		for(int i=1;i<=N;i++) {
			graph[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}
		for(int i=1;i<=N;i++) {
			Collections.sort(graph[i]);
		}
		dfsSol();
		for(int i=0;i<dfs.size();i++) {
			System.out.print(dfs.get(i)+" ");
		}
		System.out.println();
		bfsSol();
		for(int i=0;i<bfs.size();i++) {
			System.out.print(bfs.get(i)+" ");
		}
	}
	private static void dfsSol() {
		dfs = new ArrayList<Integer>();
		visit = new boolean[N+1];
		stk = new Stack<Integer>();
		stk.push(V);
		dfs.add(V);
		boolean barrier;
		while(!stk.isEmpty()) {
			int s = stk.peek(); 
			visit[s]= true;
			barrier=false;
			for(int i:graph[s]) {
				if(!visit[i]) {
					dfs.add(i);
					stk.push(i);
					visit[i]=true;
					barrier=true;
					break;
				}
			}
			if(!barrier) {
				stk.pop();
			}
		}
	}	
	private static void bfsSol() {
		visit = new boolean[N+1];
		bfs = new ArrayList<Integer>();
		que = new LinkedList<Integer>();
		que.add(V);
		visit[V]=true;
		
		while(!que.isEmpty()) {
			int q=que.poll();
			bfs.add(q);
			for(int i:graph[q]) {
				if(!visit[i]) {
					que.add(i);
					visit[i]=true;
				}
			}	
		}
	}
}




















