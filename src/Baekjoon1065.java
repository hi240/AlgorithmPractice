import java.util.Scanner;

/*
� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
210 - 105
110 - 99
1000-144
1-1
 */
public class Baekjoon1065 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	int count =99;
	if(n<100) {
		System.out.println(n);
	}else {
	for(int i=100;i<=n;i++) {
			int s = i%10; //1���ڸ�
			int k = (i/10)%10; //10���ڸ�
			int l = (i/100); //100 ���ڸ�
 			if((s-k)==(k-l)) {
				count++;
			}
	}
	System.out.println(count);
	}
	
	}
}
/*
�Ѽ� ������ ��������..100�̸��� ���� �� �Ѽ���. ��� ��.
*/