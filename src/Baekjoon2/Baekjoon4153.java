package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//Á÷°¢»ï°¢Çü
public class Baekjoon4153 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==0&&b==0&&c==0)break;
			int max = Math.max(Math.max(a, b), c);
			if(a==max) {
				if((a*a)==(b*b)+(c*c)) {
					System.out.println("right");
				}else System.out.println("wrong");
			}else if(b==max) {
				if((b*b)==(a*a)+(c*c)) {
					System.out.println("right");
				}else System.out.println("wrong");
			}else if(c==max) {
				if((c*c)==(b*b)+(a*a)) {
					System.out.println("right");
				}else System.out.println("wrong");
			}
			
		}
		sc.close();
	}
}
