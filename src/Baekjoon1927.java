import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
/* �ּ���
�迭�� �ڿ��� x�� �ִ´�.
�迭���� ���� ���� ���� ����ϰ�, �� ���� �迭���� �����Ѵ�.
���α׷��� ó���� ����ִ� �迭���� �����ϰ� �ȴ�.

�Է�
ù° �ٿ� ������ ���� N(1��N��100,000)�� �־�����. ���� N���� �ٿ��� ���꿡 ���� ������ ��Ÿ���� ���� x�� �־�����. ���� x�� �ڿ������ �迭�� x��� ���� �ִ�(�߰��ϴ�) �����̰�,
x�� 0�̶�� �迭���� ���� ���� ���� ����ϰ� �� ���� �迭���� �����ϴ� ����̴�. �ԷµǴ� �ڿ����� 2^31���� �۴�.

���
�Է¿��� 0�� �־��� ȸ����ŭ ���� ����Ѵ�. ���� �迭�� ��� �ִ� ����ε� ���� ���� ���� ����϶�� �� ��쿡�� 0�� ����ϸ� �ȴ�.
 */
public class Baekjoon1927 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>();

		for(int i=0;i<num;i++) {
			int temp = Integer.parseInt(br.readLine());;
			if(temp!=0) {
				que.add(temp);
			}else {
				if(que.isEmpty()) {
					System.out.println("0");
					continue;
				}
				System.out.println(que.peek());
				que.poll();
			}
		}
		br.close();

	}
}