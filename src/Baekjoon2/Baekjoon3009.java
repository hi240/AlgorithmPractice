package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//네 번째 점
public class Baekjoon3009 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		int e =sc.nextInt();
		int f =sc.nextInt();
		int x = 0;
		int y = 0;
		sc.close();
		if(a==c) {
			x=e;
		}else if(a==e){
			x=c;
		}else {
			x=a;
		}
		if(b==d) {
			y=f;
		}else if(b==f) {
			y=d;
		}else {
			y=b;
		}
		System.out.println(x+" "+y);
	}
}
