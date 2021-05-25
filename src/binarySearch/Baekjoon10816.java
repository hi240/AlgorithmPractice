package binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//숫자 카드2
public class Baekjoon10816 {
	public static void main(String[] args) throws IOException{ //{1,2,2,3,4}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int[] arr =new int[n];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		st = new StringTokenizer(br.readLine());
		int m=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m;i++) {
			int num=Integer.parseInt(st.nextToken());
			bw.write(upperbound(num,arr)-lowerbound(num,arr)+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	public static int lowerbound(int num,int[] arr) {
		int mid;
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			mid=(left+right)/2;
			if(arr[mid]<num) left=mid+1;
			else right=mid;
		}
		return right;
	}
	public static int upperbound(int num,int[] arr) {
		int mid;
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			mid=(left+right)/2;
			if(arr[mid]<=num) left=mid+1;
			else right=mid;
		}
		if(arr[right]==num) right++;
		return right;
	}
}
