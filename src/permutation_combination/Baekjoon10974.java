package permutation_combination;

import java.util.Scanner;
//모든 순열
public class Baekjoon10974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] visit= new boolean[n];
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		int[] output = new int[n];
		permutation(visit,arr,output,0,n);
	}
	public static void permutation(boolean[] visit,int[] arr,int[] output,int depth,int n) {
		if(depth==n) {
			for(int i=0;i<n;i++) {
				System.out.print(output[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i]=true;
				output[depth]=arr[i];
				permutation(visit,arr,output,depth+1,n);
				visit[i]=false;
			}
		}
	}
}
