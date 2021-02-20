package backTracking;

import java.io.IOException;
import java.util.Scanner;

public class Beakjoon15651_repeat {
	public static int n;
	public static int m;
	public static int[] arr;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		arr = new int[m]; 
		dfs(0,0);
	}
	public static void dfs(int at,int depth) {
		if(depth==m) {
			for(int i=0;i<m;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=n;i++) {
			arr[depth]=i;
			dfs(i,depth+1);
		}
	}
}
