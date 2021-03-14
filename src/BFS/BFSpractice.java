package BFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//BFS 기본 코드 카피
public class BFSpractice {
	static int V, E, S; //V:정점의개수 E:간선 S:시작 정점의 번호
	static int x,y; //간선의 정보
	static ArrayList<Integer> [] graph;
	static ArrayList<Integer> bfs;
	static boolean[] visit; //이미 방문한 정점을 담는다.
	static Queue<Integer> Que;
	
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		st = new StringTokenizer(br.readLine());
		V=Integer.parseInt(st.nextToken());
		E=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[E+1];
		
		for(int i=1;i<=E;i++) {
			graph[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<E;i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			graph[x].add(y);
			graph[y].add(x);
		}
		
		for(int i=1;i<=E;i++) {
			Collections.sort(graph[i]);
		}
		bfsSol();
		for(int i=0;i<bfs.size();i++) {
			System.out.println(bfs.get(i)+" ");
		}
		
	}

	private static void bfsSol() {
		
		bfs = new ArrayList<Integer>();
		visit = new boolean[E+1];
		Que = new LinkedList<Integer>();
		
		Que.add(S);
		visit[S]=true;
		
		while(!Que.isEmpty()) {
			int q = Que.poll();
			bfs.add(q);
			
			for(int i:graph[q]) {
				if(!visit[i]) {
					Que.add(i);
					visit[i]=true;
				}
			}
		}
		
	}
	
}
