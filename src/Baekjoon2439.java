import java.io.IOException;
import java.util.Scanner;

/*
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
    *
   **
  ***
 ****
*****
n=5;
 */
public class Baekjoon2439 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<n+1;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
