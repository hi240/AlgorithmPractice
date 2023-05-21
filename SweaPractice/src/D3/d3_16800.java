package D3;
import java.util.*;
import java.io.FileInputStream;

public class d3_16800 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            long n=sc.nextLong();
            long max=0;
            for(long i=1;i<=Math.sqrt(n);i++){
                if(n%i==0) max = Math.max(max,i);
            }
            long partner = n/max;
            long sum = max+partner-2;
            System.out.printf("#%d %d\n",test_case,sum);
		}
	}
}
