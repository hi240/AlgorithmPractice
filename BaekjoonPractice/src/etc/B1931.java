package etc;

import java.util.Arrays;
import java.util.Scanner;

public class B1931 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][2];
		for(int i=0;i<num;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr,((int[] a,int[] b)->{
				if(a[1]==b[1]) return a[0]-b[0];
				else return a[1]-b[1];
				}));
		int answer=0;
		int cut = -1;
		for(int[] a:arr) {
			if(cut<=a[0]) {
				answer++;
				cut = a[1];
			}
		}
		System.out.println(answer);
	}
}
