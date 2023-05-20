package D3;

import java.util.Scanner;
import java.io.FileInputStream;
public class d3_15230 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
        sc.nextLine();
        char[] origin = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int test_case = 1; test_case <= T; test_case++){
            char[] ch = sc.nextLine().toCharArray();
            int sum=0;
            for(int i=0;i<ch.length;i++){
            	if(ch[i]==origin[i]) sum++;
                else break;
            }
            System.out.printf("#%d %d\n",test_case,sum);
		}
	}
}
