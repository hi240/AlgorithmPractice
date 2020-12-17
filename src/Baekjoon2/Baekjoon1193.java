package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon1193 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int line =0;
		int count =0;
		while(true) {
			for(int i=0;i<line+1;i++) {
				count++;
			}
			line++;
			if(count>=num)break;
		}
		int sum=0;
		for(int i=0;i<line;i++) {
			sum += i;
		}
		int be = num-sum;
		if(line%2==0) {
			System.out.print(be);
			System.out.print("/");
			System.out.print(line+1-be);
		}else {
			System.out.print(line+1-be);
			System.out.print("/");
			System.out.print(be);
		}
	}
}