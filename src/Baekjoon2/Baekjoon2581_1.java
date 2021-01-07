package Baekjoon2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//소수 재시도
public class Baekjoon2581_1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int sum =0;
		int check =0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=a;i<=b;i++) {
			if(i==1) check=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					check=1;
					break;
				}
			}
			if(check==0) {
				arr.add(i);
				sum +=i;
			}
			check=0;
		}
		if(arr.size()!=0) {
			System.out.println(sum);
			System.out.println(arr.get(0));
		}else{
			System.out.println(-1);
		}
	}
}
