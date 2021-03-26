package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//¼û¹Ù²ÀÁú
public class Baekjoon1697 {
	static int N;
	static int K;
	static int time;
	static int[] visit= new int[100001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N= Integer.parseInt(st.nextToken());
		K= Integer.parseInt(st.nextToken());
		for(int i=0;i<visit.length;i++) {
			visit[i]=0;
		}
		if(N==K) {
			System.out.println("0");
			System.exit(0);
		}
		bfs();
	}
	public static void bfs() {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(N);
		visit[N]=1;
		while(!que.isEmpty()) {
			int n=que.poll();
			int[] arr = {n+1,n-1,2*n};
			for(int i=0;i<3;i++) {
				if(arr[i]>=0&&arr[i]<visit.length&&visit[arr[i]]==0) {
					que.add(arr[i]);
					if(arr[i]==K) {
						System.out.println(visit[n]);
						return;
					}
					visit[arr[i]]=visit[n]+1;
				}
			}
		}
	}
}
