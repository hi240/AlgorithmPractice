import java.io.IOException;
import java.util.Scanner;

/*
���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)

��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

���
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.

10 5
1 10 4 9 2 3 8 5 7 6
�� 1 4 2 3
 */
public class Baekjoon10871 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(a<x) {
				System.out.print(a+" ");
			}
		}
		sc.close();
		
		
	}
}
