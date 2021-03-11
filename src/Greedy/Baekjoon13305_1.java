package Greedy;

import java.util.Scanner;

//¡÷¿Øº“-1
public class Baekjoon13305_1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] distance = new int[num-1];
		int[] price = new int[num-1];
		for(int i=0;i<num-1;i++) {
			distance[i]= sc.nextInt();
		}
		for(int i=0;i<num-1;i++) {
			price[i]= sc.nextInt();
		}
		sc.close();
		int sum=0;
		
		int index=0;
		while(true) {
			if(index>num-1)break;
			if(distance[index]==0) break;
			
			int temp_index=index; 
			Loop1:for(int i=index;i<num-1;i++) {
				if(price[index]>=price[i]) {
					sum += price[index]*distance[index];
					distance[index]=0;
					temp_index++;
					break Loop1;
				}
				if(price[index]<price[i]) { 
					temp_index=i;
					sum += price[index]*distance[i];
					distance[i]=0;
				}
			}
			index=temp_index;
			
		}
		
		if(index==0) sum-=distance[0]*price[0];
		System.out.println(sum);
		
	}
}
