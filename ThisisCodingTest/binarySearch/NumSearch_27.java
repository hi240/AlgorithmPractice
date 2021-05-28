package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//정렬된 배열에서 특정 수의 개수 구하기
public class NumSearch_27 {
	public static int[] arr;
	public static int x;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		x=sc.nextInt();
		arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int a = upperbound()-lowerbound();
		if(a==0)System.out.println(-1);
		else System.out.println(a);
	}
	public static int lowerbound() {
		int mid;
		int min=0;
		int max=arr.length-1;
		while(min<max) {
			mid=(min+max)/2;
			if(arr[mid]<x) min=mid+1;
			if(arr[mid]>=x) max=mid;
		}
		return max;
	}
	public static int upperbound() {
		int mid;
		int min=0;
		int max=arr.length-1;
		while(min<max) {
			mid=(min+max)/2;
			if(arr[mid]<=x) min=mid+1;
			if(arr[mid]>x) max=mid;
		}
		if(arr[max]==x) max++;
		return max;
	}
}
