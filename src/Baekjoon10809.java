import java.io.IOException;
import java.util.Scanner;

/*
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

알파벳은 총 26개
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
 * 우선 알파벳의 순서를 기록을 해야된다.
 * 알파벳 순서에서 각 알파벳에 그 순서숫자를 대입 해줘야한다.
 * 대입받지 못한 알파벳은 -1 의 숫자를 가지게 한다.
 */