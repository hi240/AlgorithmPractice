package backTracking;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon15649_1 {
	static int n;
	static int m;
	static boolean[] check;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		arr = new int[m];
		check= new boolean[n];
		recursive(0);
	}
	public static void recursive(int depth) {
		if(depth==m) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<n;i++) {
			if(!check[i]) {
				check[i]=true;
				arr[depth]=i+1;
				recursive(depth+1);
				check[i]=false;
			}
		}
		return;
	}
}
