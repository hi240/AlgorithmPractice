package etc;
import java.util.Scanner;

public class B1806 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //배열의길이
		int s = sc.nextInt(); //총합
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i]= sc.nextInt();
		}
		int r=0;
		int sum=0;
		int ans=Integer.MAX_VALUE;
		for(int l=0;l<n;l++) {
			while(r<n&&sum<s) {
				sum += num[r];
				r++;
			}
			if(sum>=s) {
				ans = Math.min(ans, r-l);
			}
			sum -= num[l];
		}
		if(ans==Integer.MAX_VALUE) System.out.println("0");
		else System.out.println(ans);
	}
}
