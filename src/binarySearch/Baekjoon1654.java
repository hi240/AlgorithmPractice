package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//랜선 자르기
public class Baekjoon1654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		binary(arr,k);
		System.out.println(Integer.MAX_VALUE);
	}
	public static void binary(int[] arr,int k) {
		long mid;
		long min=1;
		long max=arr[arr.length-1];
		long count;
		while(min<=max) {
			count=0;
			mid=(min+max)/2;
			for(int i=0;i<arr.length;i++) {
				count += arr[i]/mid;
			}
			if(count>=k) min=mid+1;
			else max=mid-1;
		}
		System.out.println(max);
	}
}
