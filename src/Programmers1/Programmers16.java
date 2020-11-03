package Programmers1;

import java.io.IOException;
//3진법 뒤집기
public class Programmers16 {
	public static void main(String[] args) throws IOException{
		
		int n= 125;
		  String temp ="";
	        while(n!=0) {
				temp += String.valueOf(n%3);
				n /= 3;
			}
			n=Integer.parseInt(temp);
	        int length=(int)(Math.log10(n)+1);
			int num=0;
	        int m=0;
			for(int i=0;i<length;i++) {
				m = n%10;
				num += Math.pow(3, i)*m;
				n /=10;
			}
		System.out.println(num);
	}
}
