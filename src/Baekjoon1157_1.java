import java.io.IOException;
import java.util.Scanner;

/*
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

�Է�
ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

���
ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
��ҹ��� ������ ����.

Mississipi ?
zZp        z

 */
public class Baekjoon1157_1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a=a.toUpperCase();
		char word[] =a.toCharArray();
		int count[] = new int[28];
		for(int i=0;i<word.length;i++) {
			if(word[i]<=64||word[i]>93) continue;
			count[word[i]-65]++;
		}
		int max = 0;
		int maxword =0;
		for(int i=0;i<count.length;i++) {
			if(count[i]>max) {
				max=count[i];
				maxword=i;
			}
		}
		count[maxword]=0;
		String answer= String.valueOf((char)(maxword+65));
		for(int i=0;i<count.length;i++) {
			if(count[i]==max) {
				answer="?";
			}
		}
		System.out.println(answer);
	}
}
