import java.util.Scanner;

/*
 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
public class Arrangement4344 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int c =sc.nextInt();
		int[] arr = new int[c];
		for(int i=0;i<arr.length;i++) {
			int n=sc.nextInt();
			int[] arr2 = new int[n];
			int sum =0;
			int smart=0;
				for(int j=0;j<arr2.length;j++) {
					int score = sc.nextInt();
					arr2[j]=score;
					sum+=score;
				}
				int avg=sum/arr2.length;
				for(int j=0;j<arr2.length;j++) {
					if(arr2[j]>avg) {
						smart++;
					}
				}
			double property = (double)smart/arr2.length;
			System.out.printf("%.3f%s",property*100,"% \n");
		}
	}
}

/*
 * 4344 풀때 막혔던거:
 * 나눗셈을 이용해 소수점 출력을 할 때 막혔음.
 * double을 사용하면 /로 나눗셈 했을 때 나머지까지 함께 출력시킬 수 있음!
 * System.out.printf("%.3f",double);로 변수타입 맞춰주기+소수점자리수 설정!
 * 
 */

