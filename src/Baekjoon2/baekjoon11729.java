package Baekjoon2;

import java.io.IOException;
import java.util.Scanner;
//하노이의 탑
public class baekjoon11729 {
	public static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		sb.append((int)Math.pow(2,n)-1+"\n");
		func(n,1,2,3);
		System.out.println(sb);
		
	}
	public static void func(int n,int from,int mid,int end) {
		if(n==1) {
			sb.append(from+" "+end+"\n");
			return;
		}
		func(n-1,from,end,mid);
		sb.append(from+" "+end+"\n");
		func(n-1,mid,from,end);
		
	}
}
