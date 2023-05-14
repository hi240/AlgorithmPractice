package D2;
import java.util.Scanner;

public class d2_1989 {
		public static void main(String args[]) throws Exception {
			Scanner sc = new Scanner(System.in);
			int T;
			T=sc.nextInt();
			for(int test_case = 1; test_case <= T; test_case++)
			{
	            String str = sc.next();
	         	int result = 1;
	            for(int i=0;i<str.length()/2;i++){
	            	if(str.charAt(i)!=str.charAt(str.length()-i-1)){
	                	result=0;
	                    break;
	                }
	            }
	            System.out.printf("#%d %d \n",test_case, result);
			}
		}
}
