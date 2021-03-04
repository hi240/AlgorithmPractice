package Greedy;

import java.io.IOException;
import java.util.Scanner;
//µ¿Àü 0
public class Baekjoon11047 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int price = sc.nextInt();
		int count=0;
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=1;i<=num;i++) {
			int quotient=price/arr[arr.length-i];
			if(quotient>0) {
				count += quotient;
				price -= arr[arr.length-i]*quotient;
			}
			if(price==0)break;
		}
		
		System.out.println(count);
		
	}
}
