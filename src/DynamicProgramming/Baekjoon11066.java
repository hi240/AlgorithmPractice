package DynamicProgramming;

import java.util.Scanner;

//���� ��ġ��
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
	//sum(a,b,c);
	}
} 
/*
�ּ��� ���� ����� �ָ� �����ؼ� �ּҷ� ���ϰ�,
������ �ּ��� ���� ����� �ָ� �����ؼ� �ּ� ��Ʈ�� �����,
�׳� �� ���Ƽ� �ּҰ��� ã�°� ����̶�� �����Ѵ�


*/