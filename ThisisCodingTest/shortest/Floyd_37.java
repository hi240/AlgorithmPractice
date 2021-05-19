package shortest;
import java.util.Arrays;
import java.util.Scanner;
//플로이드
public class Floyd_37 {
	static int INF = 9999999;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=sc.nextInt();
		int[][] arr = new int[n+1][n+1];
		//무한값으로 초기화
		for(int i=1;i<n+1;i++) {
			Arrays.fill(arr[i],INF);
		}
		//자기자신의 경로는 0으로
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<n+1;j++) {
				if(i==j) arr[i][j]=0;
			}
		}
		//간선노드 경로 연결
		for(int i=0;i<m;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int cost=sc.nextInt();
			if(arr[x][y]>cost) arr[x][y]=cost;
		}
		//플로이드로 최단거리 연결
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
				}
			}
		}
		//여전히 없는 경로는 0으로
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<n+1;j++) {
				if(arr[i][j]==INF) arr[i][j]=0;
			}
		}
		print(arr,n);
	}

	public static void print(int[][] arr,int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
