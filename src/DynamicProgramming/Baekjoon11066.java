package DynamicProgramming;

import java.util.Scanner;

//파일 합치기
public class Baekjoon11066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int i=0;i<testcase;i++) {
			int num=sc.nextInt();
			int[] page = new int[num];
			for(int j=0;j<page.length;j++) {
				page[j]=sc.nextInt();
			}
			function(page);
		}
		
	}
	public static void function(int[] file) {
		int[][] dp = new int[file.length][file.length];
		int[] sum = new int[file.length];
		sum[0]=file[0];
	sum(a,b,c);
	}
} 
/*
최소의 합을 만드는 애를 선정해서 최소로 더하고,
별개로 최소의 합을 만드는 애를 선정해서 최소 셋트를 만들고,
그냥 다 돌아서 최소값을 찾는게 방법이라고 생각한다


*/