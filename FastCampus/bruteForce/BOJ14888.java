package bruteForce;

import java.util.Arrays;
import java.util.Scanner;

//연산자끼워넣기
public class BOJ14888 {
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int[] arr;
	static int[] math;
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		input();
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		arr=new int[N+1];
		for(int i=1;i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		math=new int[5];
		for(int i=1;i<=4;i++) {
			math[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(math));
		sc.close();
	}
}
