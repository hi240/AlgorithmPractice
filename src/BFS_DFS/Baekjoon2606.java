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

//바이러스-BFS
public class Baekjoon2606 {
	public static void main(String[] args) throws IOException {
		
		Queue<Integer> que = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int connect = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] graph = new ArrayList[num+1];
		boolean[] visit = new boolean[num+1];
		
		for(int i=0;i<num+1;i++) {
			graph[i]= new ArrayList<Integer>();
		}
		
		for(int i=0;i<connect;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}
		
		int count=0;
		que.add(1);
		visit[1]=true;
		while(!que.isEmpty()) {
			int q=que.poll();
			for(int i:graph[q]) {
				if(!visit[i]) {
					count++;
					que.add(i);
					visit[i]=true;
				}
			}
		}
		System.out.println(count);
		
	}
}
