import java.util.Scanner;

/*
 10818
N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
 */
public class Arrangement10818 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max =-1000000;
		int[] arr = new int[num]; //������ŭ�迭�����
		int min =1000000;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			//min = arr[0];
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.printf("%d %d",min,max);
	}
}
