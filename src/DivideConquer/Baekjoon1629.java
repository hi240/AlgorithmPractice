package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

//°ö¼À
public class Baekjoon1629 {
	static int m;
	static int n;
	static BigInteger d;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		BigInteger b = new BigInteger(arr[0]);
		n=Integer.parseInt(arr[0]);
		m=Integer.parseInt(arr[1]);
		d= new BigInteger(arr[2]);
		func(b,0);
	}
	public static void func(BigInteger bn,int count) {
		if(count==m) {
			System.out.println("bn "+bn);
			bn.divide(d);
			System.exit(0);
		}
		System.out.println("bn "+bn);
		func(bn.multiply(bn),count+1);
		
	}
}
