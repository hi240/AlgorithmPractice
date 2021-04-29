package permutation_combination;

import java.util.Scanner;

//1,2,3 ¥ı«œ±‚
public class Baekjoon9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testnum=sc.nextInt();
		int[] arr = new int[testnum];
		for(int i=0;i<testnum;i++) {
			arr[i]=sc.nextInt();
			System.out.println(re(arr[i]));
		}
	}
	public static int re(int num) {
		if(num==1) return 1;
		if(num==2) return 2;
		if(num==3) return 4;
		return re(num-1)+re(num-2)+re(num-3);
	}
}
