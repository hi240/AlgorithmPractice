package backTracking;

import java.io.IOException;
import java.util.Scanner;
//좋은 수열
public class Baekjoon2661 {
	public static int n;
	public static void main(String[] args) throws IOException{
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		dfs("");
	}
	public static void dfs(String a) {
		if(a.length()==n) {
			if(valid(a)) {
				System.out.println(a);
				System.exit(0);
			}else {
				return;
			}
		}
		for(int i=1;i<=3;i++) {
			if(valid(a)) {
				dfs(a+i);
			}
		}
	}
	public static boolean valid(String a) {
		for(int i=1;i<=a.length()/2;i++) {
			if(a.substring(a.length()-i).equals(a.substring(a.length()-2*i,a.length()-i))) return false;
		}
		return true;
	}
}
