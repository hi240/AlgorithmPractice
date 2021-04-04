package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//색종이 만들기
public class Baekjoon2630_1 {
	static boolean[][] map;
	static int white;
	static int blue;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size=Integer.parseInt(br.readLine());
		map= new boolean[size][size];
		for(int i=0;i<size;i++) {
			String[] arr=br.readLine().split(" ");
			for(int j=0;j<size;j++) {
				map[i][j]= arr[j].equals("1");
			}
		}
		func(0,0,size);
		System.out.println(white);
		System.out.println(blue);
	}
	public static void func(int n,int m,int c) {
		
		if(c==1) {
			if(map[n][m]) {
				blue++;
			}else {
				white++;
			}
			return;
		}
		boolean bool=true;
		loop: for(int i=n;i<n+c;i++) {
			for(int j=m;j<m+c;j++) {
				if(map[i][j]!=map[n][m]) {
					bool=false;
					break loop;
				}
			}
		}
		
		if(bool) {
			if(map[n][m]) {
				blue++;
			}else {
				white++;
			}
			return;
		}
		
		c=c/2;
		func(n,m,c);
		func(n+c,m,c);
		func(n,m+c,c);
		func(n+c,m+c,c);
		
	}
}
