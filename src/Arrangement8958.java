import java.util.Scanner;

/*
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
���� ���, 10�� ������ ������ 3�� �ȴ�.

"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.

OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
 */
public class Arrangement8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		String[] array = new String[a];
		for(int i=0;i<a;i++) {
			array[i]=sc.next();
			int sum=0;
			int count=0;
			for(int j=0;j<array[i].length();j++) {
				if(array[i].charAt(j)=='O') {
					sum += ++count;
				}else {
					count=0;  
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}

