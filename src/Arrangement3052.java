import java.util.Scanner;

/*
���� 3052
�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 

�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.

���
ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
39, 40, 41, 42, 43, 44, 82, 83, 84, 85�� 42�� ���� �������� 39, 40, 41, 0, 1, 2, 40, 41, 0, 1�̴�.
 */
public class Arrangement3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt()%42;
		}
		
		int num=0;
		for(int i=0;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(arr[i]==arr[j]) {
					num++;
				}
			}
		}
		System.out.println(num/2-9);
		int result=10-(num/2-9);
		System.out.println(result);
	}
}
