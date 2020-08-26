import java.util.Scanner;

/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
210 - 105
110 - 99
1000-144
1-1
 */
public class Baekjoon1065 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	int count =99;
	if(n<100) {
		System.out.println(n);
	}else {
	for(int i=100;i<=n;i++) {
			int s = i%10; //1의자리
			int k = (i/10)%10; //10의자리
			int l = (i/100); //100 의자리
 			if((s-k)==(k-l)) {
				count++;
			}
	}
	System.out.println(count);
	}
	
	}
}
/*
한수 문제의 주의점은..100미만의 수는 다 한수다. 라는 것.
*/