package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//ÄõµåÆ®¸®
public class Baekjoon1992 {
	static int size;
	static boolean[][] map;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		size=Integer.parseInt(br.readLine());
		map= new boolean[size][size];
		
		for(int i=0;i<size;i++) {
			String[] arr=br.readLine().split("");
			for(int j=0;j<size;j++) {
				map[i][j]= arr[j].equals("1");
			}
		}
		
		tree(0,0,size);
		
		System.out.println(sb);
		
	}
	public static void tree(int n,int m,int size) {
		
		boolean bool=true;
		
		loop: for(int i=n;i<n+size;i++) {
			for(int j=m;j<m+size;j++) {
				if(map[i][j]!=map[n][m]) {
					sb.append("(");
					bool=false;
					break loop;
				}
			}
		}
		
		if(bool) {
			if(map[n][m]) {
				sb.append("1");
			}else {
				sb.append("0");
			}
			return;
		}
		
		size /=2;
		tree(n,m,size);
		tree(n,m+size,size);
		tree(n+size,m,size);
		tree(n+size,m+size,size);
		sb.append(")");
	}
}
