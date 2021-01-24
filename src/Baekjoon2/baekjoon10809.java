package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//¾ËÆÄºª Ã£±â
public class baekjoon10809 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		
		char[] arr = word.toCharArray();
		int[] num = new int[26];
		int[] count = new int[26];
		for(int i=0;i<26;i++) {
			num[i]=-1;
		}
		for(int i=0;i<word.length();i++) {
			if(count[arr[i]-97]==0) {
				num[arr[i]-97]=i;
				count[arr[i]-97]++;
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
