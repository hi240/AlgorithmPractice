package programmers02;

import java.util.Arrays;

//�ּڰ� �����
public class MinMaking {
	public static void main(String[] args) {
	}
	class Solution{
	    public int solution(int []A, int []B){
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int answer=0;
	        for(int i=0;i<A.length;i++){
	            answer +=A[i]*B[B.length-1-i];
	        }
	        return answer;
	    }
	}
}
