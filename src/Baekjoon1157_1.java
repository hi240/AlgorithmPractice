import java.io.IOException;
import java.util.Scanner;

/*
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
대소문자 구분이 없다.

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
