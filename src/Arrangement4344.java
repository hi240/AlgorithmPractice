import java.util.Scanner;

/*
 ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */
public class Arrangement4344 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int c =sc.nextInt();
		int[] arr = new int[c];
		for(int i=0;i<arr.length;i++) {
			int n=sc.nextInt();
			int[] arr2 = new int[n];
			int sum =0;
			int smart=0;
				for(int j=0;j<arr2.length;j++) {
					int score = sc.nextInt();
					arr2[j]=score;
					sum+=score;
				}
				int avg=sum/arr2.length;
				for(int j=0;j<arr2.length;j++) {
					if(arr2[j]>avg) {
						smart++;
					}
				}
			double property = (double)smart/arr2.length;
			System.out.printf("%.3f%s",property*100,"% \n");
		}
	}
}

/*
 * 4344 Ǯ�� ��������:
 * �������� �̿��� �Ҽ��� ����� �� �� ������.
 * double�� ����ϸ� /�� ������ ���� �� ���������� �Բ� ��½�ų �� ����!
 * System.out.printf("%.3f",double);�� ����Ÿ�� �����ֱ�+�Ҽ����ڸ��� ����!
 * 
 */

