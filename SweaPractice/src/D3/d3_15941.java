package D3;
import java.util.*;
import java.io.FileInputStream;

public class d3_15941 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int n = sc.nextInt();
            System.out.printf("#%d %d\n", test_case,n*n);
		}
	}
}
