package bruteForce;

import java.util.Arrays;
import java.util.Scanner;

//수열 정렬
public class BOJ1015 {
	public static int N;
	public static my[] arr;
	public static int[] p;
	public static void main(String[] args) {
		input();
		Arrays.sort(arr);
		solv();
		for(int i=0;i<N;i++) {
			System.out.print(p[i]+" ");
		}
	}
	public static void solv() {
		for(int i=0;i<N;i++) {
			p[arr[i].index]=i;
		}
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		arr = new my[N];
		p=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=new my();
			arr[i].num=sc.nextInt();
			arr[i].index=i;
		}
	}
	static class my implements Comparable<my>{
		int num;
		int index;
		public int compareTo(my other) {
			return num-other.num;
		}
	}
}
