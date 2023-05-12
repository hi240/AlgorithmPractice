package D1;

import java.util.Scanner;
import java.io.FileInputStream;
public class d1_2072 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int sum;
		for(int test_case = 1; test_case <= T; test_case++){
            sum=0;
			for(int i=0;i<10;i++){
             	  int num= sc.nextInt();
				if(num%2!=0){
                    sum +=num;
                }
            }
            System.out.println("#"+test_case+" "+sum);
		}
	}
}
