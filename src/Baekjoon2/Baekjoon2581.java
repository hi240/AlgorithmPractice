package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//¼Ò¼ö
public class Baekjoon2581 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int min = 0;
		int sum =0;
		if(a==3) {
			a++;
			min =3;
			sum =3;
		}
		if(a==1) {
			if(b!=1) {
				a++;
			}else {
				System.out.println(-1);
				System.exit(0);
			}
		}
		if(a%2==0) {
			if(a==2) {
				min=2;
				sum+=2;
				if(b!=2) {
				a++;
				}else {
					System.out.println(2);
					System.exit(0);
				}
			}
			Loop1: for(int i=a;i<=b;i+=2) {
				System.out.println("a "+a);
				for(int j=3;j<i;j+=2) {
					if(i==j) continue;
					else{
						if(i%j==0) continue Loop1;
					}
				}
				if(min==0) min=a;
				sum +=i;
			}
		}else {
			Loop1: for(int i=a;i<=b;i+=2) {
				for(int j=3;j<i;j+=2) {
					if(i==j) continue;
					if(i%j==0) continue Loop1;
				}
				if(min==0) min=a;
				sum +=i;
			}
		}
		if(sum==0)System.out.println(-1);
		else {
		System.out.println(sum);
		System.out.println(min);
		}
	}
}
