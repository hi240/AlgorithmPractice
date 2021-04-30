package Programmers1;
//소수 찾기
public class DecimalFinding {
	public static void main(String[] args) {
	}
	class Solution {
	    public int solution(int n) {
	        int count=2;
	        if(n==2) return 1;
	        if(n==3) return 2;
	        for(int i=4;i<=n;i++){
	           if(del(i)) count++;
	        }
	        return count;
	    }
	    public boolean del(int n){
	        for(int i=2;i<=Math.sqrt(n);i++){
	            if(n%i==0)return false;
	        }
	        return true;
	    }
	}
}
