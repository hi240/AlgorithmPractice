package Programmers1;
//정수 제곱근 판별
public class SqrtCheck {
	public static void main(String[] args) {
	}
	class Solution {
	    public long solution(long n) {
	        if(Math.sqrt(n)*10%10!=0) return -1;
	        n=(long)Math.sqrt(n);
	        return (long)Math.pow(n+1,2);
	    }
	}
}
