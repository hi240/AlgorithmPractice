package Sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//통계학
public class baekjoon2108 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int testnum = sc.nextInt();
		int[] num = new int[testnum];
		
		int sum =0;
		int mid =0;
		int freq = 0;
		int range = 0;
		
		for(int i=0;i<testnum;i++) {
			num[i]=sc.nextInt();
			sum +=num[i];
		}
		sum /=testnum;
		
		//중앙값
		Arrays.sort(num);
		
		for(int i=0;i<testnum;i++) {
			
		}
	}
}
