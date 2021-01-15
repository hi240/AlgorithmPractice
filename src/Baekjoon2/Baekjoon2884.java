package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;

//알람 시계
public class Baekjoon2884 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(b>=0&&b<45) {
			if(a==0) a=24;
			a -=1;
			b +=15;
			System.out.println(a+" "+b);
		}else if(b>=45&&b<=59) { 
			b -= 45;
			System.out.println(a+" "+b);
		}
	}
}
