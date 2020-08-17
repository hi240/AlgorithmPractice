import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

출력
각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 */
public class Baekjoon15552 {
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //입력을 위한 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//출력을 위한
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
 * 15552 buffer을 처음배웠다.
 * st.nextToken() 으로 " " 공백을 끊어 읽을 수도 있고, 아니면 .split 을 사용해도된다.
 */
