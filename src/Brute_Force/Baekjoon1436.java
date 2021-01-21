package Brute_Force;

import java.io.IOException;
import java.util.Scanner;
//¿µÈ­°¨µ¶ ¼ò
public class Baekjoon1436 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		sc.close();
		int special =7;
		int specialforth=0;
		int specialback =0;
		int initial =0;
		int count =0;
		String num= "";
		for(int i=1;i<n+1;i++) {
			if(i!=special) {
				num=initial+"666";
				initial ++;
			}else {
				if(specialforth==0)num="666"+specialback;
				else{
					num=specialforth+"666"+specialback;
				}
				specialback++;
				special++;
				count++;
				if(count==10) {
					specialback=0;
					special=i+10;
					count=0;
					initial++;
					specialforth++;
				}
			}
		}
        if(n==1)num="666";
		System.out.println(num);
	}
}
/*
1- 666
2- 1666
7~16- 6660 6669
17- 7666
19- 9666
20- 10666
25- 15666
26~35- 16660 16669
36- 17666
44- 25666
45~54 - 26660 26669
55- 27666
64~73 - 36660
83~92 -46660
102~111 -56660~ 56669
112 - 57666

*/