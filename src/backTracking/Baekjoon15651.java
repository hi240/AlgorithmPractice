package backTracking;

import java.io.IOException;
import java.util.Scanner;
//n°ú m(3)
public class Baekjoon15651 {
	static int n;
	static int m;
	static int[] arr;
	static StringBuffer sb;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		sb=new StringBuffer();
		arr= new int[m];
		recursive(0);
		System.out.println(sb.toString());
	}
	public static void recursive(int depth) {
		if(m==depth) {
			for(int i=0;i<m;i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=1;i<=n;i++) {
			arr[depth]=i;
			recursive(depth+1);
		}
	}
}
