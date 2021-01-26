package Programmers2;
//124 ³ª¶ó
public class Programmers_124 {
	class Solution {
	    public String solution(int n) {
	        StringBuffer sb = new StringBuffer();
	        int temp=0;
	        while(n!=0){
	            temp= n%3;
	            n /=3; 
	            if(temp==0){
	                temp=4;
	                n-=1;
	            }
	            sb.append(temp);
	        }
	        
	        String answer = sb.reverse().toString();
	        
	        return answer;
	      
	    }
	}
}
