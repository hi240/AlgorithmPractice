package backTracking;

import java.io.IOException;
import java.util.Scanner;

//부분수열의 합 블로그
public class Baekjoon1182_1 {
	public static int n;
	public static int s;
	public static int count;
	public static int[] arr;
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
		dfs(0,0);
		System.out.println(s==0?count-1:count);
		
	}
	public static void dfs(int depth,int sum) {
		
		if(depth==n) {
			if(sum==s) {
				count++;
			}
			return;
		}
		dfs(depth+1,sum);
		dfs(depth+1,sum+arr[depth]);
		
	}
}
