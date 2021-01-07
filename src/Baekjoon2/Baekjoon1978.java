package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;

//소수찾기
public class Baekjoon1978 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int sum=0;
		Loop1: for(int i=0;i<testcase;i++) {
			int a= sc.nextInt();
			if(a==1)continue;
			if(a==2||a==3) {
				sum++;
				continue;
			}
			if(a%2!=0) {
				for(int j=3;j<a;j+=2) {
					if(a%j==0) {
						continue Loop1;
					}
				}
				sum++;
			}
		}
		sc.close();
		System.out.println(sum);
	}
}
