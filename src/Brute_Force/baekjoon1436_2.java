package Brute_Force;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//¿µÈ­°¨µ¶ ¼ò
public class baekjoon1436_2 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		sc.close();
		int i=0;
		String num="";
		for(i=666;n>0;i++) {
			num= String.valueOf(i);
			if(num.contains("666"))n--;
		}
		System.out.println(num);
	}
}
