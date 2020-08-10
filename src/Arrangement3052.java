import java.util.Scanner;

/*
백준 3052
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
39, 40, 41, 42, 43, 44, 82, 83, 84, 85를 42로 나눈 나머지는 39, 40, 41, 0, 1, 2, 40, 41, 0, 1이다.
 */
public class Arrangement3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt()%42;
		}
		
		int num=0;
		for(int i=0;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(arr[i]==arr[j]) {
					num++;
				}
			}
		}
		System.out.println(num/2-9);
		int result=10-(num/2-9);
		System.out.println(result);
	}
}
