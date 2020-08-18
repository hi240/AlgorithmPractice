import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
 */
public class Baekjoon11021 {
	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in)); //�Է��� ���� ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����� ����
		int t = Integer.parseInt(br.readLine());
		for(int i=1;i<t+1;i++) {
			StringTokenizer st = new StringTokenizer (br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+(a+b)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
