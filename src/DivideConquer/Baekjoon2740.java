package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//Çà·Ä °ö¼À
public class Baekjoon2740 {
	static int[][] arr1;
	static int[][] arr2;
	static int[][] fix;
	static int n;
	static int k;
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer sb = new StringTokenizer(br.readLine());
	n = Integer.parseInt(sb.nextToken());
	int m = Integer.parseInt(sb.nextToken());
	arr1= new int[n][m];
	for(int i=0;i<n;i++) {
		sb = new StringTokenizer(br.readLine());
		for(int j=0;j<m;j++) {
			arr1[i][j]=Integer.parseInt(sb.nextToken());
		}
	}
	sb = new StringTokenizer(br.readLine());
	k = Integer.parseInt(sb.nextToken());
	int l = Integer.parseInt(sb.nextToken());
	arr2= new int[k][l];
	for(int i=0;i<k;i++) {
		sb = new StringTokenizer(br.readLine());
		for(int j=0;j<l;j++) {
			arr2[i][j]=Integer.parseInt(sb.nextToken());
		}
	}
	fix=new int[n][k];
	tree(0,0,n);
	
	}
	public static void tree(int x,int y,int v) {
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				for(int j1=0;j<k;j1++) {
		//		arr1[i][j1]*arr[j1][j];
				}
			}
		}
	}
}






