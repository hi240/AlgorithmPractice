package Brute_Force;

import java.util.Arrays;
import java.util.Scanner;
//∫Ì∑¢¿Ë
public class Baekjoon2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		int max =0;
		for(int i=1;i<n+1;i++) {
			for(int j=i+1;j<n+1;j++) {
				for(int k=j+1;k<n+1;k++) {
					if(arr[n-i]+arr[n-j]+arr[n-k]<=m) {
						if(arr[n-i]+arr[n-j]+arr[n-k]>max) {
							max=arr[n-i]+arr[n-j]+arr[n-k];
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
