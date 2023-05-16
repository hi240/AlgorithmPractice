package D2;

import java.util.Scanner;

public class d2_1926 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            char[] charr = String.valueOf(i).toCharArray();
            for(int j=0;j<charr.length;j++){
            	if(charr[j]=='3'||charr[j]=='6'||charr[j]=='9') sb.append("-");
            }
            if(sb.length()>0) System.out.println(sb.toString());
            else System.out.println(i);
        }
	}
}
