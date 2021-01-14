package Brute_Force;

import java.util.Scanner;
//ºÐÇØÇÕ 
public class Baekjoon2231 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int i=0;
		int result=0;
		while(i<a) {
			i++;
			int num=0;
			String temp = String.valueOf(i);
			for(int j=0;j<temp.length();j++) {
				num +=Integer.parseInt(String.valueOf(temp.charAt(j)));
			}
			if(num+i==a) {
				result=i;
				break;
			}
		}
		System.out.println(result);
	}
}
