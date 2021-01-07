package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//Fly me to the Alpha Centauri
//0 10 > 6이 나와야 함.
public class Baekjoon1011 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int k=0;k<testcase;k++) {
			int sum=0;
			int x = sc.nextInt();
			int y = sc.nextInt()-1;
			int distance = y-x;
			int i=1;
			while(distance>0) {
				distance -= i;
				i++;
				sum++;
			}
			System.out.println(sum+1);
		}
		sc.close();
	}
}
