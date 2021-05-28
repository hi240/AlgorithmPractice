package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//������ ��ġ
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
// ���� �Ÿ��� �������� ������ ���� �˰� ���� ������.
// ��α׸� ���� => �� �� ���� �Ÿ��� �������� �ؾ߰ڴٴ°� �˰Ե�.

//������ ��ġ ������ binary�� ���Ѵٰ� �����غ���.