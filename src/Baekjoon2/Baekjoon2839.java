package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
/*
 * 설탕배달
 * 3kg 5kg 봉지가 있다. 최소로 가져가는 봉지의 갯수는?
 * 18 4 //5 5 5 3
 * 숫자 %5 다 해고 누적해서 %3
 * 15
 */
public class Baekjoon2839 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bag = 0;
		while(num/5>0) {
			bag = num/5; // 3;
			num %= 5;
			System.out.println("num"+num);
		}
		if(num/3==0) {
			bag = -1;
		}
		//num== 4면, 
		
		while(num/3>0) { //num/3 ==1
			if(num%3==0) {
				bag++;
				num =0;
			}else {
				bag = -1;
				num =0;
			}
			
		}
		
		System.out.println(bag);
	}
}
