package Baekjoon2;
import java.io.IOException;
import java.util.Scanner;
//소수구하기(에라토스테네스의 체)
public class Baekjoon1929 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int[] arr = new int[b+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		arr[1]=0;
		for(int i=2;i*i<b;i++) {
			for(int j=i*i;j<arr.length;j+=i) {
				arr[j]=1;
			}
		}
		for(int i=a;i<arr.length;i++) {
			if(arr[i]==0) {
				if(i==1)continue;
				System.out.println(i);
			}
		}
	}
}
