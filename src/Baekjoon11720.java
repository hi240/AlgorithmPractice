import java.io.IOException;
import java.util.Scanner;

/*N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.

���
�Է����� �־��� ���� N���� ���� ����Ѵ�.
 */
public class Baekjoon11720 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		int sum = 0;
		for(int i=0;i<count;i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
		
	}
}
