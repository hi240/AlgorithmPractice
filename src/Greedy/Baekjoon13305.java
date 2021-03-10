package Greedy;

import java.util.Scanner;

//¡÷¿Øº“
public class Baekjoon13305 {
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
		
		int sum=0;
		for(int i=0;i<num;i++) {
			int is_min=0;
			int full_check=0;
//			if(i==0) {
//				sum=distance[0]*price[0];
//			}
			for(int j=i+1;j<num-1;j++) {
				full_check++;
				if(price[i]<price[j]) {
					is_min++;
				}
			}
			if(is_min==full_check) {
				for(int j=i;j<num-1;j++) {
					if(j==0)continue;
					sum += distance[j]*price[i];
				}
				break;
			}else {
				if(i==0) continue;
				sum += distance[i]*price[i];
			}
		}
		
		System.out.println(sum);
		
	}
}
