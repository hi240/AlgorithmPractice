package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//Çà·Ä °ö¼À
public class Baekjoon2740_1 {
	public static int[][] arr1;
	public static int[][] arr2;
	public static int[][] ans;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer sb = new StringTokenizer(br.readLine());
		int an = Integer.parseInt(sb.nextToken());
		int am = Integer.parseInt(sb.nextToken());
		arr1 = new int[an][am];
		
		for(int i=0;i<an;i++) {
			sb = new StringTokenizer(br.readLine());
			for(int j=0;j<am;j++) {
				arr1[i][j]=Integer.parseInt(sb.nextToken());
			}
		}
		
		sb = new StringTokenizer(br.readLine());
		int bn = Integer.parseInt(sb.nextToken());
		int bm = Integer.parseInt(sb.nextToken());
		arr2 = new int[bn][bm];
		
		for(int i=0;i<bn;i++) {
			sb = new StringTokenizer(br.readLine());
			for(int j=0;j<bm;j++) {
				arr2[i][j]=Integer.parseInt(sb.nextToken());
			}
		}
		
		ans = new int[an][bm];
		
		func(an,am,bn,bm);
		
		for(int i=0;i<an;i++) {
			for(int j=0;j<bm;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void func(int an,int am,int bn,int bm) {
		
		for(int i=0;i<an;i++) {
			for(int j=0;j<bm;j++) {
				for(int k=0;k<am;k++) {
					ans[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		
	}
}
