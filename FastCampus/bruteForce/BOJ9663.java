package bruteForce;

import java.util.Scanner;

public class BOJ9663 {
	static int n,sum;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		arr = new int[n];
		dfs(0);
		System.out.println(sum);
	}
	public static void dfs(int depth) {
		if(depth==n) {
			sum++;
		}else {
			for(int i=0;i<n;i++) {
				boolean bool = true;
				for(int j=0;j<depth;j++) {
					if(!able(depth,i,j,arr[j])) {
						bool = false;
						break;
					}
				}
				if(!bool) continue;
				arr[depth]=i;
				dfs(depth+1);
				arr[depth]=0;
			}
		}
	}
	public static boolean able(int r1,int c1,int r2,int c2) {
		if(c1==c2) return false;
		else if(r1-c1==r2-c2) return false;
		else if(r1+c1==r2+c2) return false;
		return true;
	}
}
