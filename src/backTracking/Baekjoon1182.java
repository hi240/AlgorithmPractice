package backTracking;

import java.util.Scanner;

//부분수열의 합 실패
public class Baekjoon1182 {
public static int N;
public static int S;
public static int[] arr;
public static boolean[] visit;
public static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		S= sc.nextInt();
		arr=new int[N];
		visit=new boolean[N];
		num=0;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		dfs(0,1,1);
		System.out.println("경우의 수 : "+num);
	}
	public static void dfs(int at,int depth,int size) {
		if(depth==size&&at!=0) {
			int sum=0;
			for(int i=at;i<at+size;i++) {
				sum+=arr[i];
			}
			//System.out.println("sum "+sum);
			if(sum==S) num++;
			return;
		}
		for(int i=at;i<N;i++) {
			if(!visit[i]) {
				visit[i]=true;
				System.out.println(i+" i");
				dfs(at+1,depth,size);
				visit[i]=false;
			}
		}
	}
}
