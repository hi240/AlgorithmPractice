package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//회의실 배정
public class Baekjoon1931 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count =0;
		int[][] arr = new int[num][2];
		for(int i=0;i<num;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] a,int[] b){
				if(a[1]==b[1]) {
					return a[0]-b[0];
				}else
				return a[1]-b[1];
			}
		});

		
		int min=0;
		for(int i=0;i<num;i++) {
			if(arr[i][0]>=min) {
				count++;
				min=arr[i][1];
			}
		}
		System.out.println(count);
	}

}