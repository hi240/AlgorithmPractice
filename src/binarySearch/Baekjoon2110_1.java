package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//공유기 설치-두번째 시도
public class Baekjoon2110_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		binary(arr,c);
	}
	public static void binary(int[] arr,int c) {
		int mid;
		int start=1;
		int end=arr[arr.length-1]-arr[0];
		int result=0;
		while(start<=end) {
			mid=(start+end)/2;
			int prev=arr[0];
			int count=1;
			for(int i=0; i<arr.length;i++) {
				int d=arr[i]-prev;
				if(d>=mid) {
					count++;
					prev=arr[i];
				}
			}
			if(count>=c) {
				start=mid+1;
				result=mid;
			}
			else if(count<c) {
				end=mid-1;
			}
		}
		System.out.println(result);
	}
}
