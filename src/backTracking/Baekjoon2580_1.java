package backTracking;

import java.util.Scanner;

//스도쿠
public class Baekjoon2580_1 {
	public static int[][] arr=new int[9][9];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		recursive(0,0);
	}
	public static void recursive(int n,int m) {
		if(m==9) {
			recursive(n+1,0);
			System.out.println("어디루가니?");
			return;
		}
		if(n==9) {
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		System.out.println("어딘가");
		if(arr[n][m]==0) {
			System.out.println("어디에");
			for(int i=1;i<=9;i++) {
				if(promising(n,m,i)) {
					System.out.println("어디로가나");
					arr[n][m]=i;
					recursive(n,m+1);
					arr[n][m]=0;
				}
			}
		}
		System.out.println("어디여기로?");
		recursive(n,m+1);
	}
	
	public static boolean promising(int n,int m,int value) {
		for(int i=0;i<9;i++) {
			if(arr[n][i]==value) {
				System.out.println("만약");
				return false;
			}
		}
		for(int i=0;i<9;i++) {
			if(arr[i][m]==value) {
				System.out.println("만약");
				return false;
			}
		}
		int x=(n/3)*3;
		int y=(m/3)*3;
		for(int i=x;i<x+3;i++) {
			for(int j=y;j<y+3;j++) {
				if(arr[i][j]==value) {
					System.out.println("만약");
					return false;
				}
			}
		}
		System.out.println("만약의 트루");
		return true;
	}
	
}
