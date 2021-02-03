package backTracking;

import java.io.IOException;
import java.util.Scanner;
//n°ú m(1)
public class Baekjoon15649 {
	static boolean check[];
	static int arr[];
	static int depth=0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); 
		sc.close();
		check = new boolean [n];
		arr = new int[m];
		recursive(n,m,0);
		System.out.println(sb);
	}
	public static void recursive (int n,int m,int depth) {
		if(depth==m) { 
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]);
				if(i!=arr.length-1)sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<n;i++) {
			if(!check[i]) { 
				check[i]=true;
				arr[depth]=i+1; 
				recursive(n,m,depth+1);
				check[i]=false;
			}
		}
		return;
	}
	
}
