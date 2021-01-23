import java.io.IOException;
import java.util.Scanner;

//³ª¸ÓÁö
public class Baekjoon3052 {
	public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[42];
	
	for(int i=0;i<10;i++) {
		int temp = sc.nextInt();
		arr[temp%42] = 1;
	}
	sc.close();
	
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum +=arr[i];
	}
	
	System.out.println(sum);
	
	}
}
