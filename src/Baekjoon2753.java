import java.io.IOException;
import java.util.Scanner;

/*
 * ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.

���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.

�Է�
ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
 */
public class Baekjoon2753 {
	public static void main(String[] args) throws IOException{
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(((a%4==0)&&!(a%100==0))||(a%400==0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}
