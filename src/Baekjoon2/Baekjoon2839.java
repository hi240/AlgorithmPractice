package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
/*
 * �������
 * 3kg 5kg ������ �ִ�. �ּҷ� �������� ������ ������?
 * 18 4 //5 5 5 3
 * ���� %5 �� �ذ� �����ؼ� %3
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
		//num== 4��, 
		
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
