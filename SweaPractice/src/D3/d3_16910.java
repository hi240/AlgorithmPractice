package D3;

import java.util.Scanner;
import java.io.FileInputStream;
public class d3_16910 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int n = sc.nextInt();
            int sum=0;
            for(int x=-n;x<=n;x++){
                for(int y=-n;y<=n;y++){ 
                    if(n*n>=x*x+y*y) sum++;
                }
            }
            System.out.printf("#%d %d\n", test_case, sum);
		}
	}
}
