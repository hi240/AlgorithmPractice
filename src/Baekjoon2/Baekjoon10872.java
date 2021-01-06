package Baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Àç±Í-ÆÑÅä¸®¾ó
public class Baekjoon10872 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(factorial(Integer.parseInt(br.readLine())));
		br.close();
	}
	public static int factorial(int a) {
		if(a==1||a==0)return 1;
		return a*factorial(a-1);
	}
}
