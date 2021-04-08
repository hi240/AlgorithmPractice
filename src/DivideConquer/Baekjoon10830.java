package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon10830 {
	public static long[][] arr;
	public static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer sb = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(sb.nextToken());
		long m = Long.parseLong(sb.nextToken());
		arr = new long[n][n];
		
		for(int i=0;i<n;i++) {
			sb = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<n;j++) {
				arr[i][j]=Integer.parseInt(sb.nextToken());
			}
		}
		
		long[][] ans=func(m);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				bw.write(ans[i][j]+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	public static long[][] func(long m) {
		long[][] temp = new long[n][n];
		long[][] chk = new long[n][n];

		if(m==1) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					chk[i][j] =arr[i][j]%1000;
				}
			}
			return chk;
		}
		
		chk=func(m/2);
		
		//Â¦¼ö
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					temp[i][j] += chk[i][k]*chk[k][j];
				}
				temp[i][j]%=1000;
			}
		}
		//È¦¼ö
		if(m%2!=0) {
			long[][] odd = new long[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					for(int k=0;k<n;k++) {
						odd[i][j] += temp[i][k]*arr[k][j];
					}
					odd[i][j]%=1000;
				}
			}
			return odd;
		}else {
			return temp;
		}
		
	}
	
}
