package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//택시 기하학
public class Baekjoon3053 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		System.out.println(Math.round(Math.pow(r, 2)*Math.PI*1000000)/1000000.0);
		System.out.println(Math.round(2*Math.pow(r, 2)*1000000)/1000000.0);
	}
}
