package shortest;
import java.util.Arrays;
import java.util.Scanner;
//�÷��̵�
public class Floyd_37 {
	static int INF = 9999999;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=sc.nextInt();
		int[][] arr = new int[n+1][n+1];
		//���Ѱ����� �ʱ�ȭ
		for(int i=1;i<n+1;i++) {
			Arrays.fill(arr[i],INF);
		}
		//�ڱ��ڽ��� ��δ� 0����
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<n+1;j++) {
				if(i==j) arr[i][j]=0;
			}
		}
		//������� ��� ����
		for(int i=0;i<m;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int cost=sc.nextInt();
			if(arr[x][y]>cost) arr[x][y]=cost;
		}
		//�÷��̵�� �ִܰŸ� ����
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
				}
			}
		}
		//������ ���� ��δ� 0����
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
