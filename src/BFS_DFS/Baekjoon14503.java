package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//로봇 청소기
public class Baekjoon14503 {
	static int[][] map;
	static boolean[][] visit;
	static int n;
	static int m;
	static int num;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		visit = new boolean[n][m];
		int r = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt(); //d=0 북, 1=동, 2=남, 3=서
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		num=0;
		dfs(r,c,d,0);
		
	}
	public static void dfs(int x,int y,int d,int wall) {
		System.out.println("보는곳 "+x+"x "+y+"y "+d+"d");
		if(map[x][y]==0) {
			map[x][y]=1; //청소
			num++;
			wall=0;
		}
		if(left(x,y,d)) { //a.
			System.out.println("hh?");
			switch(d) {
			case 0: dfs(x,y-1,3,wall); break;
			case 1: dfs(x-1,y,0,wall); break;
			case 2: dfs(x,y+1,1,wall); break;
			case 3: dfs(x+1,y,2,wall); break;
			}
		}else { //b.
			System.out.println("bb?");
			wall +=1;
			if(wall==4) {
				if(back(x,y,d)) { //뒤에 가능하면,
					switch(d) {
					case 0: dfs(x+1,y,d,wall); break;
					case 1: dfs(x,y-1,d,wall); break;
					case 2: dfs(x-1,y,d,wall); break;
					case 3: dfs(x,y+1,d,wall); break;
					}
				}else {
					for(int i=0;i<n;i++) {
						for(int j=0;j<m;j++) {
							System.out.print(map[i][j]);
						}
						System.out.println();
					}
					System.out.println(num);
					System.exit(0);
					return;
				}
			}
			switch(d) {
			case 0: dfs(x,y,3,wall); break;
			case 1: dfs(x,y,0,wall); break;
			case 2: dfs(x,y,1,wall); break;
			case 3: dfs(x,y,2,wall); break;
			}
		}
	}
	public static boolean left(int x,int y,int d) {
		switch(d) {
		case 0: if(map[x][y-1]==1) return false;break;
		case 1: if(map[x-1][y]==1) return false;break;
		case 2: if(map[x][y+1]==1) return false;break;
		case 3: if(map[x+1][y]==1) return false;break;
		}
		return true;
	}
	public static boolean back(int x,int y,int d) {
		System.out.println("여기서 걸렸어? "+x+" "+y+" "+d);
		switch(d) {
		case 0: if(map[x+1][y]==1) {System.out.println("누"); return false; }break;
		case 1: if(map[x][y-1]==1) {System.out.println("이거?");return false;}break;
		case 2: if(map[x-1][y]==1) {System.out.println("f");return false;}break;
		case 3: if(map[x][y+1]==1) {System.out.println("ne");return false;}break;
		}
		return true;
	}
}
class dot{
	int x;
	int y;
	dot(int x,int y){
		this.x=x;
		this.y=y;
	}
}
