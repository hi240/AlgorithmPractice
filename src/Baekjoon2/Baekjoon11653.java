package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//소인수분해
public class Baekjoon11653 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		sc.close();
		if(num==1) {
			System.out.println();
		}else {
			int i=2;
			while(i<num) {
				if(num%i!=0) {
					i++;
					continue;
				}
				else {
					num /= i;
					System.out.println(i);
				}
			}
			System.out.println(num);
		}
	}
}
