import java.io.IOException;
import java.util.Scanner;

/*
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����.
S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
Q.
2
3 ABC
5 /HTP
A.
AAABBBCCC
/////HHHHHTTTTTPPPPP
 */
public class Baekjoon2675 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int re = Integer.parseInt(sc.next());
		String a = "ds";
		//String a = sc.nextLine();
		String[] arr = new String [num];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<a.length();j++) {
				a.indexOf(j);
				System.out.println(a.indexOf(j));
			}
		}
		
		
	}
}
/*
 * �� ���� �Է¹ޱ�.
 * length=num�� �迭�� �����.
 * num[0]�� a�� �� ���ڸ���(a.charAt(0)...) re1���� �ݺ��Ѱ� �迭�� �ִ´�.

 */
