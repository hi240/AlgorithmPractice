package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//공유기 설치
public class Baekjoon2110 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int c= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		binary(arr,c);
		
	}
	public static void binary(int[] arr,int c) {
		int mid;
		int min=1;
		int max=arr[arr.length-1]-arr[0];
		int cnt=1;
		while(min<=max) {
			int prev=arr[0];
			mid=(min+max)/2;
			for(int i=0;i<arr.length;i++) {
				int d =arr[i]-prev;
				if(d>=mid) {
					cnt++;
					prev=arr[i];
				}
			}
			if(cnt<c) min=mid+1;
			else if(cnt>=c) max=mid-1;
		}
		System.out.println(max);
	}
}
// 1 2 3 4 5 6 7 8 9
// 1 2 4 8 9
// 집의 거리를 기준으로 나눠야 할줄 알고 감을 못잡음.
// 블로그를 보고 => 각 집 간의 거리를 기준으로 해야겠다는걸 알게됨.

//공유기 설치 간격을 binary가 구한다고 생각해보자.