import java.io.IOException;
import java.util.Scanner;

/*
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
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
 * 각 조건 입력받기.
 * length=num인 배열을 만든다.
 * num[0]은 a의 한 글자마다(a.charAt(0)...) re1번씩 반복한걸 배열에 넣는다.

 */
