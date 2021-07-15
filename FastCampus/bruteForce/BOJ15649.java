package bruteForce;

import java.util.Scanner;

//n과M(1) //순서 있고 중복 없는
public class BOJ15649 {
	public static int N,M;
	public static int[] arr;
	public static boolean[] bool;
	public static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		input();
		solve(0);
		System.out.println(sb.toString());
	}
	public static void solve(int depth) {
		if(depth==M) {
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
		}else {
			for(int i=1;i<=N;i++) {
				if(!bool[i-1]) {
					arr[depth]=i;
					bool[i-1]=true;
					solve(depth+1);
					bool[i-1]=false;
					arr[depth]=0;
				}
			}
		}
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		arr= new int[M];
		bool= new boolean[N];
		sc.close();
	}
}
