package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
/*
 * 설탕배달
 * 3kg 5kg 봉지가 있다. 최소로 가져가는 봉지의 갯수는?
 * 18 4 //5 5 5 3
 * 숫자 %5 다 해고 누적해서 %3
 * 15
 * 
 * 
 * 21
 * 7봉지
 * 5 5 5 3 3
 */
public class Baekjoon2839 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bag = 0;
		int temp = num;
		int three = 0;
		int five = 0;
		int mix = 0; //temp=18
		while(temp>0) {
			if(temp<=2) {
				break;
			}
			temp -= 3;
			three++;
		}
		if(temp!=0) {
			three=1000;
		}
		temp = num;
		while(temp>0) {
			if(temp<=4) {
				break;
			}
			temp -= 5;
			five++;
		}
		if(temp!=0) {
			five=1000;
		}
		temp=num;
		while(temp>0) { 
			temp -= 5; 
			mix++;
			if(temp%3==0) { //temp==6
				mix += temp/3; //mix += 2;
				temp -= 3*(temp/3);
			}
		}
		if(temp!=0) {
			mix=1000;
		}
		int answer =0;
		if(three==1000&&five==1000&&mix==1000) {
			answer = -1;
		}else {
			answer = Math.min(three, Math.min(five, mix));
		}
		System.out.println(answer);
	}
}
