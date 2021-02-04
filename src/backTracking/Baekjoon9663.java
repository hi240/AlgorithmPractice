package backTracking;

import java.io.IOException;
import java.util.Scanner;
//N-Queen
public class Baekjoon9663 {
	static int n;
	static int[] arr;
	static int count;
	public static void main(String[] args) throws IOException{
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		arr = new int[n];
		count=0;
		recursive(0);
		System.out.println(count);
	}
	public static void recursive(int depth) {
		if(depth==n) { 
			count++;
			return;
		}
		for(int i=0;i<n;i++) {
			arr[depth]=i; 
			if(promising(depth)) {
				recursive(depth+1);
			}
		}
	}
	public static boolean promising(int col) {
		for(int i=0;i<col;i++) {
			if(arr[col]==arr[i]) {
				return false;
			}
			else if(Math.abs(arr[col]-arr[i])==Math.abs(col-i)) {
				return false;
			}
		}
		return true;
	}
}
