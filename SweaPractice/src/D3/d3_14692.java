package D3;

import java.util.Scanner;
import java.io.FileInputStream;
public class d3_14692 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int n =sc.nextInt();
            String st = "Alice";
            if(n%2!=0) st= "Bob";
              System.out.printf("#%d %s\n",test_case,st);
		}
	}
}
