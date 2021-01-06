package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//¼³ÅÁ¹è´Þ
public class Baekjoon2839_1 {
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int count =0;
		while(n%5!=0&&n>0) {
				n -=3;
				count++;
			}
		if(n<0) System.out.println(-1);
		else System.out.println(n/5+count);
		
	}
}
