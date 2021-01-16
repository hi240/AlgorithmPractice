package Brute_Force;

import java.io.IOException;
import java.util.Scanner;
//덩치 -다시 풀어보기 좋은 문제
public class Baekjoon7568 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[][] arr = new int[testcase][2];
		for(int i=0;i<testcase;i++) {
			arr[i][0]= sc.nextInt();
			arr[i][1]= sc.nextInt();
		}
		sc.close();
		for(int i=0;i<testcase;i++) {
			int rank=1;
			for(int j=0;j<testcase;j++) {
				if(i==j)continue;
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					rank++;
				}
			}
			System.out.println(rank);
		}
	}
}
