package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//직사각형에서 탈출
public class Baekjoon1085 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y =sc.nextInt();
		int w =sc.nextInt();
		int h =sc.nextInt();
		sc.close();
		System.out.println(min(x,y,w,h));
	}
	public static int min(int x,int y,int w,int h) {
		int min1=Math.min(h-y,w-x);
		int min2=Math.min(x, y);
		int min=Math.min(min1,min2);
		return min;
	}
}
