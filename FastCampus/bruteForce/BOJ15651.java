package bruteForce;

import java.util.Scanner;

//N°úM(3)
public class BOJ15651 {
	public static int N,M;
	public static int[] arr;	
	public static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		input();
		solve(0,arr);
		System.out.println(sb.toString());
	}
	public static void solve(int depth,int[] arr) {
		if(depth==M) {
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
		}else {
			for(int i=1;i<=N;i++) {
				arr[depth]=i;
				solve(depth+1,arr);
			}
		}
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		arr= new int[M];
		sc.close();
	}
}
