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

//BFS구현도전
public class BFSpracticeTRY {
	static int V, E, S; //V:정점의개수 E:간선 S:시작 정점의 번호
	static int x,y; //간선의 정보
	static ArrayList<Integer> [] graph;
	static ArrayList<Integer> bfs;
	static boolean[] visit; //이미 방문한 정점을 담는다.
	static Queue<Integer> que;
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		
		V=Integer.parseInt(st.nextToken()); //정점개수
		E=Integer.parseInt(st.nextToken()); //단선개수
		S=Integer.parseInt(st.nextToken()); //시작할 정점 번호
		
		graph=new ArrayList[E+1];
		
		for(int i=1;i<=E;i++) { //ArrayList각 배열에 새 ArrayList초기화
			graph[i]=new ArrayList<Integer>();
		}
		for(int i=1;i<=E;i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}
		
		for(int i=1;i<=E;i++) { // 중첩된 ArrayList 배열이기 때문에 for문 사용
			Collections.sort(graph[i]);
		}
		
		bfsSol();
		
		for(int i=0;i<bfs.size();i++) {
			System.out.print(bfs.get(i)+" ");
		}
		
	}
	private static void bfsSol() {
		visit = new boolean[E+1];
		bfs = new ArrayList<>();
		que = new LinkedList<Integer>();
		
		que.add(S);
		visit[S]=true;
		
		while(!que.isEmpty()) {
			int a=que.poll();
			bfs.add(a);
			for(int i:graph[a]) {
				if(!visit[i]) {
					que.add(i);
					visit[i]=true;
				}
			}
		}
	}
	
}
