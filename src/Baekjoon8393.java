import java.util.Scanner;

/*
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.

���
1���� n���� ���� ����Ѵ�.
 */
public class Baekjoon8393 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		for(int i=1;i<a+1;i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
}
