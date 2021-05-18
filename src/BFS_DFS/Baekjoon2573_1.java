package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//����
public class Baekjoon2573_1 {
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	public static boolean[][] visit;
	public static int[][] arr;
	public static int w,h;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		w= sc.nextInt();
		h= sc.nextInt();
		arr = new int[w][h];
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int time=0;
		while(true) { //���� ��� ���� ����
			visit=new boolean[w][h];
			int iceberg_num=0;
			for(int i=0;i<w;i++) {
				for(int j=0;j<h;j++) {
					if(!visit[i][j]&&arr[i][j]!=0) {
						dfs(i,j,visit); //����� ���� �� ����
						iceberg_num++;
					}
				}
			}
			if(iceberg_num==0){
				System.out.println(0);
				break;
			}
			if(iceberg_num>=2) {
				System.out.println(time);
				break;
			}
			time++;
		}
		
	}
	public static void dfs(int i,int j,boolean[][] visit) {
		Queue<DOTE> que = new LinkedList<DOTE>();
		que.add(new DOTE(i,j));
		while(!que.isEmpty()) {
			DOTE dote = que.poll();
			int x=dote.x;
			int y=dote.y;
			visit[x][y]=true;
			int _x;
			int _y;
			int count=0;
			for(int k=0;k<4;k++) { //���� Ȯ��
				_x=x+dx[k];
				_y=y+dy[k];
				if(check(_x,_y,visit)) 	{
					if(!visit[_x][_y]) {
						if(arr[_x][_y]==0){
							arr[x][y] -=1;
							if(arr[x][y]<0) arr[x][y]=0;
						}else {
							visit[_x][_y]=true; //que �ߺ� �߰� ����
							que.add(new DOTE(_x,_y));
						}
					}
				}
			}
		}
	}
	public static boolean check(int i,int j,boolean[][] visit) { //ĭ �ȿ� �ִ��� Ȯ��
		if(i>=0&&j>=0&&i<w&&j<h) return true;
		return false;
	}
}
class DOTE{ //��ǥ�� ����/Ȱ���� ���� Ÿ�� ����
	int x;
	int y;
	public DOTE() {
		this.x=x;
		this.y=y;
	}
	public DOTE(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
