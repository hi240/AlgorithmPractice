package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//¼ö Ã£±â
public class Baekjoon1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			binary(sc.nextInt(),arr);
		}
		
	}
	public static void binary(int num,int[] arr) {
		int mid;
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			mid=(left+right)/2;
			if(num==arr[mid]) {
				System.out.println(1);
				return;
			}
			if(num>arr[mid]) left=mid+1;
			else right=mid-1;
		}
		System.out.println(0);
	}
}
