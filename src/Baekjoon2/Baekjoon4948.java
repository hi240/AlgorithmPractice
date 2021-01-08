package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//베르트랑 공준
public class Baekjoon4948 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum=0;
		while(a!=0){
			a=sc.nextInt();
			if(a==0)break;
			Loop1:for(int i=a+1;i<=2*a;i++) {
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						continue Loop1;
					}
				}
				sum++;
			}
			System.out.println(sum);
			sum=0;
		}
		sc.close();
	}
}
