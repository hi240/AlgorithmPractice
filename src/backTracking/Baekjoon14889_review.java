package backTracking;

import java.util.Scanner;
/*
4
0 1 2 3
4 0 5 6
7 1 0 2
3 4 5 0
 */
//스타트와 링크 복습
public class Baekjoon14889_review {
	public static int num;
	public static int[][] arr;
	public static boolean[] check;
	public static int min;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		check= new boolean[num];
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		dfs(0);
		System.out.println(min);
	}
	public static void dfs(int depth) {
		
		if(depth/2==num) {
			math();
			return;
		}
		for(int i=0;i<num;i++){
			check[i]=true;
			dfs(i);
			check[i]=false;
		}
		
	}
	public static void math() {
		int start=0;
		int link=0;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(check[i]==true&&check[j]==true) {
					start += arr[i][j];
					start += arr[j][i];
				}else if(check[i]==false&&check[j]==false) {
					link += arr[i][j];
					link += arr[j][i];
				}
			}
		}
		min=Math.min(Math.abs(start-link),min);
	}
	
}
