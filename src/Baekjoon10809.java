import java.io.IOException;
import java.util.Scanner;

/*
���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.

���
������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.

����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.

���ĺ��� �� 26��
baekjoon
a b  c  d e  f  g ...
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */
public class Baekjoon10809 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine(); //baekjooon
		int []arr = new int[26];
		for(int j=0;j<arr.length;j++) {
			arr[j]=-1;
		}
		for(int i=0;i<a.length();i++) {
			char b =a.charAt(i);
			if(arr[b-97]==-1) {
				arr[b-97]=i;
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
	}
}
/*
 * �켱 ���ĺ��� ������ ����� �ؾߵȴ�.
 * ���ĺ� �������� �� ���ĺ��� �� �������ڸ� ���� ������Ѵ�.
 * ���Թ��� ���� ���ĺ��� -1 �� ���ڸ� ������ �Ѵ�.
 */