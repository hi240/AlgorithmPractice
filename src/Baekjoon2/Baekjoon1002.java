package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//≈Õ∑ø
public class Baekjoon1002 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int testnum =sc.nextInt();
		for(int i=0;i<testnum;i++) {
			int x1= sc.nextInt();
			int y1= sc.nextInt();
			int r1= sc.nextInt();
			int x2= sc.nextInt();
			int y2= sc.nextInt();
			int r2= sc.nextInt();
			if(x1==x2&&y1==y2&&r1==r2) {
				System.out.println("-1");
				continue;
			}
			double distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
			if(distance==0||distance>r1+r2||distance<Math.abs(r2-r1)) System.out.println("0");
			else if(distance==r1+r2||distance==Math.abs(r2-r1))System.out.println("1");
			else System.out.println("2");
		}
		sc.close();
	}
}
