import java.util.Scanner;

/*
2562
 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� �ٸ� 9���� �ڿ���

3, 29, 38, 12, 57, 74, 40, 85, 61

�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.

�Է�
ù ° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.

���
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�..
 */

public class Arrangement2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr= new int[9];

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();

		int max=0;
		int b = 0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				b=i+1;
			}
		}
		System.out.println(max);
		System.out.println(b);
	}
}
