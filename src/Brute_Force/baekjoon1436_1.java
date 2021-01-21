package Brute_Force;

import java.io.IOException;
import java.util.Scanner;

public class baekjoon1436_1 {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		String num="";
		int n=sc.nextInt();
		sc.close();
		
		int forth=0;
		Boolean danger = false;
		for(int i=0;i<n;i++) {
			num=forth+"666";
			if(forth%10==5) {
				danger = true;
			}
			if(danger) {
				if(i==n-1)break;
				int count=0;
				while(count<10) {//i=6
					i++; //i==7
					num="666"+count;
					if(i+count>=n)break;
					count++;
				}
				count=0;
				danger =false;
				System.out.println(num+"dd");
			}
			forth++;
		}
		if(forth!=1)System.out.println(num);
		else System.out.println("666");
	}
	public static String special(int a) {
		String newnum ="";
		return newnum;
	}
}
