package backTracking;

import java.util.Scanner;

//��ŸƮ�� ��ũ
/*
4
0 1 2 3
4 0 5 6
7 1 0 2
3 4 5 0
���� ���, 1, 2���� ��ŸƮ ��, 3, 4���� ��ũ ���� ���� ��쿡 �� ���� �ɷ�ġ�� �Ʒ��� ����.
��ŸƮ ��: S12 + S21 = 1 + 4 = 5
��ũ ��: S34 + S43 = 2 + 5 = 7
1, 3���� ��ŸƮ ��, 2, 4���� ��ũ ���� ���ϸ�, �� ���� �ɷ�ġ�� �Ʒ��� ����.
��ŸƮ ��: S13 + S31 = 2 + 7 = 9
��ũ ��: S26 + S62 = 6 + 4 = 10
 */
public class Baekjoon14889 {
	public static int n;
	public static int sum=Integer.MAX_VALUE;
	public static int[][] arr;
	public static boolean[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		arr = new int[n][n];
		check= new boolean[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		recursive(0,0);
		System.out.println(sum);
	}
	public static void recursive(int at,int depth) {
		if(depth==n/2) {
			diff();
			return;
		}
		for(int i=at;i<n;i++) {
			if(!check[i]) {
				check[i]=true;
				System.out.println((i+1)+" i"+(depth+1)+" depth");
				recursive(i+1,depth+1);
				check[i]=false;
			}
		}
	}
	public static void diff() {
		
		int start=0;
		int link=0;
		for(int i=0;i<n-1;i++) { //for���� �̷��� �Ǵ� ������ 0 �밢�� �������� ��©���µ� ������ �ؿ� �Ŀ����ؼ� ����������!
			for(int j=i+1;j<n;j++) {
				if(check[i]==true&&check[j]==true) {
					start +=arr[i][j];
					start +=arr[j][i];
				}else if(check[i]==false&&check[j]==false) {
					link +=arr[i][j];
					link +=arr[j][i];
				}
			}
		}
		sum=Math.min(sum,Math.abs(start-link));
		
	}
}
