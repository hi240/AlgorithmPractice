package backTracking;

import java.io.IOException;
import java.util.Scanner;
/*3 3
1 1 1
1 1 2
1 1 3
1 2 2
1 2 3
1 3 3
2 2 2
2 2 3
2 3 3
3 3 3
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
				System.out.print(arr[i]);
			}
			System.out.println();
			return;
		}
		for(int i=at;i<=a;i++) {
			arr[depth]=i;
			dfs(i,depth+1);
		}
	}
}

