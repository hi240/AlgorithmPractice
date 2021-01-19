package Extra;

import java.io.IOException;
import java.util.Scanner;
//고장난 시계
public class Baekjoon15885{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		System.out.println((int)Math.abs(a-b)*2/b);
	}
}
