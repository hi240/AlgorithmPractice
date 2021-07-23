package bruteForce;

import java.util.Scanner;

//�κм����� ��
public class BOJ1182 {
	public static int N,S,score;
	public static int[] arr;
	public static void main(String[] args) {
		input();
		dfs(0,0);
		if(S==0) score--;
		System.out.println(score);
	}
	public static void dfs(int depth,int sum) {
		if(depth==N) {
			if(sum==S) score++;
		}else {
			dfs(depth+1,sum+arr[depth]);
			dfs(depth+1,sum);
		}
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		S=sc.nextInt();
		arr= new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
}
