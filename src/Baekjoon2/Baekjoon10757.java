package Baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
//Å«¼öA+B
public class Baekjoon10757 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		System.out.println(new BigInteger(a[0]).add(new BigInteger(a[1])));
	}
}
