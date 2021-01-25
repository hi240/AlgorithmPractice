package Extra;

import java.io.IOException;
import java.util.Scanner;
//5와 6의 차이
public class baekjoon2864 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		String stra = String.valueOf(a);
		String strb = String.valueOf(b);
		
		stra =stra.replace('5', '6');
		strb =strb.replace('5', '6');
		int max=Integer.parseInt(stra)+Integer.parseInt(strb);
		
		stra =stra.replace('6', '5');
		strb =strb.replace('6', '5');
		int min=Integer.parseInt(stra)+Integer.parseInt(strb);
		
		System.out.println(min+" "+max);
	}
}
