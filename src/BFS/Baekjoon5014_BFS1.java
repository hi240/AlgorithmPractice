package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
//½ºÅ¸Æ®¸µÅ©
public class Baekjoon5014_BFS1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		//f:Ãþ ¼ö  s:³»°¡ÀÖ´Â °÷   g:°¡¾ßÇÏ´Â Ãþ   u:À§·Î uÃþ   d:¹ØÀ¸·Î dÃþ
		int f = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int u = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		bfs(f,s,g,u,d);
	}
	public static void bfs(int f,int s,int g,int u,int d) {
		int[] visit = new int[f+1];
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(s);
		visit[s] =1;
		while(!que.isEmpty()) {
			int q = que.poll();
			if(q==g) System.out.println(visit[q]-1);
			if(q+u<=f&&visit[q+u]==0) {
				visit[q+u]=visit[q]+1;
				que.add(q+u);
			}
			if(q-d>0&&visit[q-d]==0) {
				visit[q-d]=visit[q]+1;
				que.add(q-d);
			}
		}
		if(visit[g]==0) {
			System.out.println("use the stairs");
		}
	}
}

