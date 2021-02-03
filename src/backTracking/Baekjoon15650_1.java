package backTracking;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon15650_1 {
	static int n;
	static int m;
	static int[] arr;
	static int at;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		m= sc.nextInt();
		sc.close();
		arr= new int[m];
		recursive(1,0);
	}
	public static void recursive(int at, int depth) {
		if(depth==m) {
			for(int i=0;i<m;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=at;i<=n;i++) {
			arr[depth]=i;
			recursive(i+1,depth+1);
		}
		
	}
}
