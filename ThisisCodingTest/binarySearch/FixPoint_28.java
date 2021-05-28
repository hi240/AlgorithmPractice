package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//고정점 찾기
public class FixPoint_28 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		binary(arr,n);
	}
	public static void binary(int[] arr,int n) {
		int mid;
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			mid=(left+right)/2;
			if(mid==arr[mid]) {
				System.out.println(mid);
				return;
			}
			if(mid<arr[mid]) right=mid-1;
			else left=mid+1;
		}
		System.out.println("-1");
	}
}
