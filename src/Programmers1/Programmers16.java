package Programmers1;

import java.io.IOException;

public class Programmers16 {
	public static void main(String[] args) throws IOException{
		
		int n= 125;
		String temp ="";
		
		while(n>0) {
			temp += String.valueOf(n%3);
			n /= 3;
		}
		
		n=Integer.parseInt(temp);
		int num=0;
		int m=0;
		
		for(int i=0;i<temp.length();i++) {
			m = n%10;
			num += Math.pow(3, i)*m;
			n /=10;
		}
		
		System.out.println(num);
	}
}
