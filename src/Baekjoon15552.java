import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.

���
�� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.
 */
public class Baekjoon15552 {
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //�Է��� ���� ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����� ����
		int t = Integer.parseInt(bf.readLine()); //Int
		for(int i=1;i<t+1;i++) {
			StringTokenizer st = new StringTokenizer (bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		bw.flush();
		bw.close();
	}
}
/*
 * 15552 buffer�� ó�������.
 * st.nextToken() ���� " " ������ ���� ���� ���� �ְ�, �ƴϸ� .split �� ����ص��ȴ�.
 */
