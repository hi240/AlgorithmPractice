package backTracking;

import java.util.Scanner;
/*
6
0 1 2 3 4 5
1 0 2 3 4 5
1 2 0 3 4 5
1 2 3 0 4 5
1 2 3 4 0 5
1 2 3 4 5 0
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
		arr=new int[num][num];
		check= new boolean[num];
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		dfs(0,0);
		System.out.println(min);
	}
	public static void dfs(int at,int depth) {
		
		if(depth==num/2) {
			math();
			return;
		}
		for(int i=at;i<num;i++){ //이게 잘못된 코드고, at을 넣어야되는데 이건 왜안되는지 모르겠따..
			if(!check[i]) {
				check[i]=true;      //dfs(0,0)
				dfs(i+1,depth+1); //dfs(1,1) dfs(2,1) (3,1) (4,1) (5,1)
				check[i]=false;
			}
		}
	}
	public static void math() {
		int start=0;
		int link=0;
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
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
