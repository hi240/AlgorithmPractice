package backTracking;

import java.io.IOException;
import java.util.Scanner;
//n°ú m(4)
public class Baekjoon15652 {
	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		sc.close();
		arr= new int[m];
		sb= new StringBuilder();
		recursive(1,0);
		System.out.println(sb.toString());
	}
	public static void recursive(int at,int depth) {
		if(depth==m) {
			for(int i=0;i<m;i++) {
				sb.append(arr[i]);
				sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=at;i<=n;i++) {
			arr[depth]=i;
			recursive(i,depth+1);
		}
	}
	
}
