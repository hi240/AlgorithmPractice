package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//종이의 개수
public class Baekjoon1780 {
	static int size;
	static int[][] map;
	static int minus;
	static int zero;
	static int plus;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		size=Integer.parseInt(st.nextToken());
		map= new int[size][size];
		
		for(int i=0;i<size;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<size;j++) {
				map[i][j]= Integer.parseInt(st.nextToken());
			}
		}

		tree(0,0,size);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(plus);
		
	}
	public static void tree(int n,int m,int size) {
		
		boolean bool=true;
		int stand=map[n][m];
		
		loop: for(int i=n;i<n+size;i++) {
			for(int j=m;j<m+size;j++) {
				if(map[i][j]!=stand) {
					bool=false;
					break loop;
				}
			}
		}
		if(bool) {
			if(map[n][m]==-1) {
				minus++;
			}else if(map[n][m]==0) {
				zero++;
			}else {
				plus++;
			}
			return;
		}
		
		size /= 3;
		tree(n,m,size);
		tree(n,m+size,size);
		tree(n+size,m,size);
		tree(n+size,m+size,size);
		int dsize = 2*size;
		tree(n+size+size,m,size);
		tree(n+dsize,m+size,size);
		tree(n,m+dsize,size);
		tree(n+size,m+dsize,size);
		tree(n+dsize,m+dsize,size);
		
	}
}