package backTracking;

import java.io.IOException;
import java.util.Scanner;
/*
4 4 ¸é
1 2 3 4
1 2 4 3
1 3 2 4
1 3 4 2
1 4 2 3
1 4 3 2
2 1 3 4
2 1 4 3
2 3 1 4
2 3 4 1
2 4 1 3
2 4 3 1
3 1 2 4
3 1 4 2
3 2 1 4
3 2 4 1
3 4 1 2
3 4 2 1
4 1 2 3
4 1 3 2
4 2 1 3
4 2 3 1
4 3 1 2
4 3 2 1
 */
public class Baekjoon15649_repeat {
	public static int a;
	public static int b;
	public static int[] arr;
	public static boolean[] visit;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt(); //4
		b = sc.nextInt(); //2
		sc.close();
		arr= new int[b];
		visit=new boolean[a];
		recursive(0);
	}
	public static void recursive(int depth) {
		if(depth==b) {
			for(int i=0;i<b;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<a;i++) {
			if(visit[i]==false) {
				visit[i]=true;
				arr[depth]=i+1;
				recursive(depth+1);
				visit[i]=false;
			}
		}
		//return;
	}
}
