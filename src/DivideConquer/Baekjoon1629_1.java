package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//°ö¼À
public class Baekjoon1629_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		long n=Integer.parseInt(arr[0]);
		long m=Integer.parseInt(arr[1]);
		long d=Integer.parseInt(arr[2]);
		
		System.out.println(func(n,m,d)%d);
	}
	public static long func(long n,long m,long d) {
		if(m==0) {
			return 1;
		}else if(m==1) {
			return n;
		}else if(m%2==0){
			long a= func(n,m/2,d)%d;
			return (a*a)%d;
		}else {
			long a= func(n,m/2,d)%d;
			return (((a*a)%d)*n)%d;
		}
	}
}
