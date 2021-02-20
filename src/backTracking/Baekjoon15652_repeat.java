package backTracking;

import java.io.IOException;
import java.util.Scanner;
/* 4 2
1 1
1 2
1 3
1 4
2 2
2 3
2 4
3 3
3 4
4 4
 */
public class Baekjoon15652_repeat {
	static int[] arr ;
	static int a;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		arr= new int[b];
		dfs(1,0);
	}
	public static void dfs(int at,int depth) {
		if(arr.length==depth) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=at;i<=a;i++) {
			arr[depth]=i;
			dfs(at,depth+1);
		}
	}
}

