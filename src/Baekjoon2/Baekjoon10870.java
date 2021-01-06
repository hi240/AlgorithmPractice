package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//피보나치 수 5

public class Baekjoon10870 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println(fivo(sc.nextInt()));
		sc.close();
	}
	public static int fivo(int n) {
		if(n<2) {
			return n;
		}
		return fivo(n-1)+fivo(n-2);
	}
}
