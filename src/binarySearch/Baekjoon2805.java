package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//나무 자르기
public class Baekjoon2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		binary(arr,m);
	}
	public static void binary(int[] arr,int m) {
		long mid=0;
		long min=1;
		long max=arr[arr.length-1];
		while(min<=max) {
			long count=0;
			mid=(min+max)/2;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]-mid<=0) continue;
				count += arr[i]-mid;
			}
			if(count<m) max=mid-1;
			if(count>=m) min=mid+1;
		}
		System.out.println(max);
	}
}