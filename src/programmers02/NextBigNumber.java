package programmers02;
//다음 큰 숫자
public class NextBigNumber {
	public static void main(String[] args) {
		int n=78;
		String str = Integer.toBinaryString(n);
		System.out.println(str);
		
	}
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        String st = Integer.toBinaryString(n);
	        int one=count(st);
	        while(true){
	            String temp= Integer.toBinaryString(++n);
	            if(one==count(temp)) return n;
	        }
	    }
	    public int count(String num){
	        int cnt=0;
	         for(int i=0;i<num.length();i++){
	           if(num.charAt(i)=='1'){
	               cnt++;
	           }
	        }
	        return cnt;
	    }
	}
}
