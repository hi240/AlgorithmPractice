package D1;

import java.util.Scanner;
import java.io.FileInputStream;
public class d1_2056 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
        int[] daymax = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int test_case = 1; test_case <= T; test_case++){
        	int ymd = sc.nextInt();
            int year = ymd/10000;
            int mon = (ymd-(year*10000))/100;
            int day = ymd%100;
            if(mon<1||mon>12||day<1||day>daymax[mon-1]){ //날짜양식에 어긋날 경우
            	System.out.printf("#%d -1\n",test_case);
            }else{
            	System.out.printf("#%d %04d/%02d/%02d\n",test_case,year,mon,day);
            }
        }
	}
}
