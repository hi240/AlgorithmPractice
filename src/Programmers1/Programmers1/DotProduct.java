package Programmers1;
//³»Àû
public class DotProduct {
	public static void main(String[] args) {
	}
	class Solution {
	    public int solution(int[] a, int[] b) {
	        int answer = 0;
	        for(int i=0;i<a.length;i++){
	            answer += a[i]*b[i];
	        }
	        return answer;
	    }
	}
}
