package backTracking;

import java.util.Scanner;
//연산자 끼워넣기
public class Baekjoon14888 {
	public static int max=Integer.MIN_VALUE;
	public static int min=Integer.MAX_VALUE;
	public static int[] number;
	public static int[] math= new int[4];
	public static int testnum;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		testnum = sc.nextInt();
		number = new int[testnum];
		
		for(int i=0;i<testnum;i++) {
			number[i]=sc.nextInt();
		}
		
		for(int i=0;i<testnum;i++) {
			math[i]=sc.nextInt();
		}
		
		sc.close();
		
		recursive(number[0],1);
		System.out.println(max);
		System.out.println(min);
		
	}
	public static void recursive(int num,int depth) {

		if(depth==testnum) {
			System.out.println(num);
			min=Math.min(min, num);
			max=Math.max(max, num);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(math[i]>0) {
				math[i]--;
				switch(i) {
				
				case 0: recursive(num+number[depth],depth+1); break;
				case 1: recursive(num-number[depth],depth+1); break;
				case 2: recursive(num*number[depth],depth+1); break;
				case 3: recursive(num/number[depth],depth+1); break;
				
				}
				math[i]++;
			}
			
		}
		
	}
	
}
