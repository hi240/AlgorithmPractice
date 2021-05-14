package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

//½ºÅ¸Æ®¸µÅ©
public class Baekjoon5014_BFS {
	public static int f;
	public static int g;
	public static int u;
	public static int d;
	public static Queue<Integer> que;
	public static ArrayList<Integer>[] arr;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		//f: Ãþ ¼ö  s:³»°¡ÀÖ´Â °÷   g:°¡¾ßÇÏ´Â Ãþ   u:À§·Î uÃþ   d:¹ØÀ¸·Î dÃþ
		f = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		g = Integer.parseInt(st.nextToken());
		u = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		que = new LinkedList<Integer>();
		arr = new ArrayList[f+1];
		for(int i=1;i<=f;i++) {
			arr[i]= new ArrayList<Integer>();
			if(i+u<=f) {
				arr[i].add(i+u);
			}
			if(i-d>=1) {
				arr[i].add(i-d);
			}
		}
		bfs(s);
		
	}
	public static void bfs(int n) {
		int visit[]=new int[f+1];
		que.add(n);
		visit[n]=1;
		while(!que.isEmpty()) {
			int q = que.poll();
			for(int i=1;i<arr[q].size();i++) {
				if(arr[i].size()>0) {
					System.out.println(i);
					visit[i]=visit[q]+1;
					que.add(i);
					if(i==g) {
						System.out.println(visit[i]);
						System.exit(9);
					}
				}
				
			}
			
		}
		System.out.println("³¡");
		
	}
}
