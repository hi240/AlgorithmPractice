package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//빙산
public class Baekjoon2573 {
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	public static boolean[][] check;
	public static int[][] arr;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int w= sc.nextInt();
		int h= sc.nextInt();
		arr = new int[w][h];
		check=new boolean[w][h];
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		ice();
		ice();
	}
	public static void ice() {
		boolean[][] visit =new boolean[arr.length][arr[0].length];
		int cnt=0;
		Queue<Node>que = new LinkedList<Node>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) continue;
				if(!visit[i][j]) {
					cnt++;
					que.add(new Node(i,j));
					while(!que.isEmpty()) {
						int _x=que.peek().x;
						int _y=que.poll().y;
						visit[_x][_y]=true;
						int count=0;
						for(int k=0;k<4;k++) {
							if(_x+dx[k]<0||_y+dy[k]<0||_x+dx[k]>=arr.length||_y+dy[k]>=arr.length) continue;
							//얼음의갯수세기
							if(arr[_x+dx[k]][_y+dy[k]]==0&&!visit[_x+dx[k]][_y+dy[k]]) {
								count++;
							}else {
								que.add(new Node(_x+dx[k],_y+dy[k]));
							}
						}
						arr[_x][_y] -=count;
						if(arr[_x][_y]<0) arr[_x][_y]=0;
//						for(int k=0;k<4;k++) {
//							if(_x+dx[k]<0||_y+dy[k]<0||_x+dx[k]>=arr.length||_y+dy[k]>=arr.length) continue;
//							if(arr[_x+dx[k]][_y+dy[k]]!=0&&!visit[_x+dx[k]][_y+dy[k]]) {
//								
//							}
//						}
					}
				}
			}
		}
		System.out.println(cnt+" s");
		//출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
class Node{
	int x;
	int y;
	public Node() {
		this.x=x;
		this.y=y;
	}
	public Node(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
