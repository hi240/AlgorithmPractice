package backTracking;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon14888_1 {
	public static int N;
	public static int[] num;
	public static int[] math=new int[4];
	public static int max=Integer.MIN_VALUE;
	public static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		num= new int[N];
		for(int i=0;i<N;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			math[i]=sc.nextInt();
		}
		sc.close();
		dfs(num[0],1);
		System.out.println(max);
		System.out.println(min);
	}
	public static void dfs(int number,int depth) {
		
		if(depth==N) {
			max=Math.max(max, number);
			min=Math.min(min, number);
			return;
		}
		for(int i=0;i<4;i++) {
			if(math[i]!=0) {
				math[i]--;
				switch(i) {
				case 0: dfs(number+num[depth],depth+1);break;
				case 1: dfs(number-num[depth],depth+1);break;
				case 2: dfs(number*num[depth],depth+1);break;
				case 3: dfs(number/num[depth],depth+1);break;
				}																											
				math[i]++;
			}
		}
		
	}
}
