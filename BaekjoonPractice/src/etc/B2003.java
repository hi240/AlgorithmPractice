package etc;

import java.util.Arrays;
import java.util.Scanner;
//������ ��2
public class B2003 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //�迭����
		int m = sc.nextInt(); //��
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i]= sc.nextInt();
		}
		int l=0;
		int r=0;
		int sum=0;
		int ans=0;
		while(l<n&&r<n) {
			sum=0;
			for(int i=l;i<r+1;i++) {
				sum += num[i];
			}
			if(sum==m) {
				ans++;
				l++;
			}else if(sum<m) { //�պ��� ���� ���
				r++;
			}else if(sum>m) { //�պ��� Ŭ ���
				l++;
			}
		}
		System.out.println(ans);
	}
}
