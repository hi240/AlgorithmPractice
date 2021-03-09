package Baekjoon2;

import java.util.Scanner;

//문자열 반복
public class Baekjoon2675 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] re = new int[num];
		String[] word = new String[num];
		
		for(int i=0;i<num;i++) {
			re[i]=sc.nextInt();
			word[i]=sc.next();
			
			for(int j=0;j<word[i].length();j++) {
				for(int k=0;k<re[i];k++) {
					System.out.print(word[i].charAt(j));
				}
			}
			System.out.println();
			
		}
		
	}
}
