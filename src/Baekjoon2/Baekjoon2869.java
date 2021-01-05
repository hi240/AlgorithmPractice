package Baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//달팽이는 올라가고 싶다
public class Baekjoon2869 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int rum =0;
		if((v-b)%(a-b)==0) {
			rum=(v-b)/(a-b);
		}else {
			rum=(v-b)/(a-b)+1;
		}
		System.out.println(rum);
		br.close();
	}
}
