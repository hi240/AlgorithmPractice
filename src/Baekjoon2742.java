import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
�ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 */
public class Baekjoon2742 {
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //�Է��� ���� ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����� ����
		int n = Integer.parseInt(bf.readLine());
		for(int i=n;i>0;i--) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
}
