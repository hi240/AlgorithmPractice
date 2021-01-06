package Baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//손익분기점
public class Baekjoon1712 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);
		int c = Integer.parseInt(st[2]);
		br.close();
        if(c==b||a/(c-b)<0){
			System.out.println(-1);
		}else {
			System.out.println(a/(c-b)+1);
		}
	}
}
