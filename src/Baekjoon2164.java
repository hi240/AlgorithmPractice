import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* ī��2
N���� ī�尡 �ִ�. ������ ī��� ���ʷ� 1���� N������ ��ȣ�� �پ� ������, 1�� ī�尡 ���� ����, N�� ī�尡 ���� �Ʒ��� ���·� ������� ī�尡 ���� �ִ�.

���� ������ ���� ������ ī�尡 �� �� ���� ������ �ݺ��ϰ� �ȴ�. �켱, ���� ���� �ִ� ī�带 �ٴڿ� ������. �� ����, ���� ���� �ִ� ī�带 ���� �Ʒ��� �ִ� ī�� ������ �ű��.

���� ��� N=4�� ��츦 ������ ����. ī��� ���� ���������� 1234 �� ������ �����ִ�. 1�� ������ 234�� ���´�. ���⼭ 2�� ���� �Ʒ��� �ű�� 342�� �ȴ�.

3�� ������ 42�� �ǰ�, 4�� ������ �ű�� 24�� �ȴ�. ���������� 2�� ������ ����, ���� ī��� 4�� �ȴ�.

N�� �־����� ��, ���� �������� ���� �Ǵ� ī�带 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

ù° �ٿ� ���� �Ǵ� ī���� ��ȣ�� ����Ѵ�.
6 4
*/
public class Baekjoon2164 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		for(int i=0;i<n;i++) {
			que.offer(i+1);
		}
		while(que.size()!=1) {
			que.poll();
			que.add(que.poll());
		}
		System.out.println(que.peek());
	}
}
