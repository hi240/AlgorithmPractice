package programmers02;
//피보나치 수
public class Fibonacci {
	public static void main(String[] args) {
	}
	public int solution(int n) {
		if(n==1||n==2) return 1;
		int j1=1;
		int j2=1;
		int sum=0;
		for(int i=3;i<=n;i++){
			sum=j1+j2;
			sum %= 1234567;
			j1=j2;
			j2=sum;
		}
		return sum;
	}
}