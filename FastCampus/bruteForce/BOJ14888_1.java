package bruteForce;

import java.util.Scanner;

public class BOJ14888_1 {
	public static int n,min,max;
	public static int[] arr;
	public static int[] cal;
	
	public static void main(String[] args) {
		input();
		dfs(0,arr[0]);
		System.out.println(max);
		System.out.println(min);
	}
	public static void dfs(int depth,int sum) {
		if(depth==n-1) {
			min=Math.min(sum, min);
			max=Math.max(sum, max);
			return;
		}else {
			for(int i=0;i<4;i++) {
				if(cal[i]>0) {
					cal[i]--;
					switch(i) {
					case 0: dfs(depth+1,sum+arr[depth+1]); break;
					case 1: dfs(depth+1,sum-arr[depth+1]); break;
					case 2: dfs(depth+1,sum*arr[depth+1]); break;
					case 3: dfs(depth+1,sum/arr[depth+1]); break;
					}
					cal[i]++; //±î¸ÔÁö¸» °Í!
				}
			}
		}
	}
	public static void input() {
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n];
		cal=new int[4];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			cal[i]=sc.nextInt();
		}
		sc.close();
	}
}
