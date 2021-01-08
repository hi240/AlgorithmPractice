package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//베르트랑 공준 +다른 풀이
public class Baekjoon4948_1 {
	public static boolean[] limit = new boolean[246913];
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		decimal();
		int count =0;
		while(true) {
			int a = sc.nextInt();
			if(a==0)break;
			for(int i=a+1;i<=2*a;i++) {
				if(!limit[i]) count++;
			}
			System.out.println(count);
		}
		sc.close();
	}
	public static void decimal() {
		limit[0]=true;
		for(int i=2;i<=Math.sqrt(limit.length);i++) {
			if(limit[i]) continue;
			for(int j=i*i;j<limit.length;j+=i) {
				limit[j]=true;
			}
		}
	}
}
