package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//�׷�ܾ�üĿ - 2�ð� �ɸ� ������ �����ɸ�..
public class Baekjoon1316_1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int sum =num;
		while(num>0) {
			
			char[] word = sc.nextLine().toCharArray();
			char[] temp = new char [word.length];
		
			Loop1 : 
			for(int i=0;i<word.length;i++) {
				temp[i] = word[i];
				for(int j=0;j<i-1;j++) {
					if(word[i]==temp[j]&&word[i-1]!=temp[j]){
						sum--;
						break Loop1;
					}
				}
			}
			
			num--;
		}
		sc.close();
		System.out.println(sum);
	}
}
