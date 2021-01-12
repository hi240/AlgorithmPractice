package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//º° Âï±â-10
public class Baekjoon2447 {
	static int a=1;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		String[] arr = new String [n];
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++) {
			sb.append("*");
		}
		for(int i=0;i<n;i++) {
			arr[i]=String.valueOf(sb);
		}
		while(n>3) {
			n /=3;
			a++;
		}
		System.out.println("¸î½Â?"+a);
		star(n);
		sc.close();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int star(int n) { //n=9, a=2
		if(n==3) {
			
			return 0;
		}
		else {
			int temp=(int)Math.pow(3, a-1); //temp=3
			for(int i=0;i<temp;i++) {
				//arr[temp]=1;
			}
			return star(n/3);
		}
	}
}
