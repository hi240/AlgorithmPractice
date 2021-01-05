package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//ACMÈ£ÅÚ
public class Baekjoon10250 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int casenum = Integer.parseInt(sc.nextLine());
		for(int i=0;i<casenum;i++) {
			String[] arr = sc.nextLine().split(" ");
			System.out.println(func(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2])));
		}
		sc.close();
	}
	public static String func(int h,int w,int n) {
		int a =0;
		int b = 0;
		if(n%h==0) {
			a=h;
			b = n/h;
		}else {
			a=n%h;
			b = n/h +1;
		}
		if(b<10) {
			return String.valueOf(a)+"0"+String.valueOf(b);
		}else {
			return String.valueOf(a)+String.valueOf(b);
		}
	}
}
