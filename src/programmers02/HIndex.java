package programmers02;
//H-Index
public class HIndex {
	public static void main(String[] args) {

	}
	class Solution {
	    public int solution(int[] citations) {
	        int answer = 0;
	        int sum=citations.length;
	        
	        for(int i=sum;i>=0;i--){
	            int ok=0; //i회 이상 인용된 논문의 개수
	            for(int j=0;j<sum;j++){
	                if(citations[j]>=i) ok++;
	            }
	            if(ok<i) continue;
	            int no=0; //i회 미만으로 인용되지 않은 논문의 개수
	            for(int j=0;j<sum;j++){
	                if(citations[j]<i) no++;
	            } 
	            if(no==sum-ok) 
	                answer=i; 
	                break;
	        }
	        
	        return answer;
	    }
	}
}
