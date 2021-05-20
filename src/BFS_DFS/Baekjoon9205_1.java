package BFS_DFS;

import java.util.ArrayList;
import java.util.Scanner;

//맥주 마시면서 걸어가기
public class Baekjoon9205_1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int t= sc.nextInt(); 
		for(int z=0;z<t;z++) {
			int n=sc.nextInt();
			ArrayList<Edge>arr = new ArrayList<>();
			int[][] map = new int[n+2][n+2];
			for(int j=0;j<n+2;j++) {
				arr.add(new Edge(sc.nextInt(),sc.nextInt()));
			}
			for(int i=0;i<n+2;i++) {
				for(int j=i+1;j<n+2;j++) {
					map[i][j]=Math.abs(arr.get(i).x-arr.get(j).x)+Math.abs(arr.get(i).y-arr.get(j).y);
					if(map[i][j]>1000) {
						map[i][j]=-1;
						map[j][i]=-1;
					}
				}
			}
			for(int k=0;k<n+2;k++) {
				for(int i=0;i<n+2;i++) {
					if(i==k) continue;
					for(int j=0;j<n+2;j++) {
						if(j==i||j==k) continue;
						if(map[i][k]==-1||map[k][j]==-1) continue;
						map[i][j]=1;
					}
				}
			}
			if(map[0][n+1]==-1)
				System.out.println("sad");
			else
			System.out.println("happy");
		}
		
	}

}
class Edge {
	int x;
	int y;
	Edge(int x,int y){
		this.x=x;
		this.y=y;
	}
}