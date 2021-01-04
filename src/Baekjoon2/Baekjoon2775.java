package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//부녀회장이 될테야!
public class Baekjoon2775 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int casenum = sc.nextInt();
		for(int i=0;i<casenum;i++) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			System.out.println(re(k,n));
		}
		
	}
	public static int re(int k,int n) {
		if(n==1) return 1;
		if(k==0) return n;
		
		return re(k,n-1)+re(k-1,n);
	}
}
