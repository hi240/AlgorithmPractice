package Greedy;

import java.util.Scanner;

//¡÷¿Øº“-2
public class Baekjoon13305_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] distance = new int[num-1];
		int[] price = new int[num];
		for(int i=0;i<num-1;i++) {
			distance[i]= sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			price[i]= sc.nextInt();
		}
		sc.close();
		
		long sum=0;
		long min=price[0];
		
		for(int i=0;i<num-1;i++) {
			if(min>price[i]) {
				min=price[i];
			}
			sum += distance[i]*min;
		}
		
	}
}
