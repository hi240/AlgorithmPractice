package programmers02;
//숫자의 표현
public class NumberExpression {
	public static void main(String[] args) {
	}
	class Solution {
	    public int solution(int n) {
	        int answer = 1;
	        for(int i=1;i<n;i++){
	            int temp=i;
	            for(int j=i+1;j<=n;j++){
	                temp +=j;
	                if(temp>n) break;
	                if(temp==n){
	                    answer++;
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
	}
}
