package backTracking;

import java.io.IOException;
import java.util.Scanner;
/*
4 2 ¸é
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
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt(); //4
		b = sc.nextInt(); //2
		sc.close();
		arr= new int[a];
		recursive(1,0);
	}
	public static void recursive(int at,int depth) {
		if(depth==b) {
			for(int i=0;i<a;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		for(int i=at;i<=a;i++) {
			arr[depth]=i;
			recursive(i,depth+1);
		}
	}
}
