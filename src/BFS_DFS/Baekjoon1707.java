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
public class Baekjoon1707 {
	static ArrayList<Integer>[] graph;
	static boolean[] visit;
	static boolean[] black;
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
			
			black=new boolean[V+1]; //블랙인지확인
			visit=new boolean[V+1]; //정점반복확인
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
	public static void bfs(int V,int E) { //v정점,E는간선의 개수
		Queue<BW> que= new LinkedList<BW>();
		que.offer(new BW(1,true));
		visit[1]=true;
		black[1]=true;
		int a=real(que);
		
		if(a!=1) {
			for(int i=0;i<V;i++) {
				if(!visit[i]) { //방문하지않은 정점이있으면, que에 추가해서 루프다시돌아라.
					que.add(new BW(i,true));
					visit[i]=true;
					black[i]=true;
					real(que);
				}
			}	
		System.out.println("YES");
		}
	}
	public static int real(Queue<BW> que) {
		while(!que.isEmpty()) {
			BW bw = que.poll();
			for(int i=0;i<graph[bw.V].size();i++) {
				if(!visit[graph[bw.V].get(i)]) {
					visit[graph[bw.V].get(i)]=true;
					black[graph[bw.V].get(i)]=!bw.black;
					que.add(new BW(graph[bw.V].get(i),!bw.black));
				}else {
					if(black[graph[bw.V].get(i)]==bw.black) {
						System.out.println("NO");
						return 1;
					}
				}
			}
		}
		return 0;
	}
}
class BW{
	int V;
	boolean black;
	BW(int V,boolean black){
		this.V=V;
		this.black=black;
	}
}
