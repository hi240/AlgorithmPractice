package programmers02;
//¿Ã¹Ù¸¥ °ýÈ£
public class CorrectBracket {
	public static void main(String[] args) {
	}
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        int cn=0;
	        int cnt=0;
	        if(s.charAt(0)!='(') return false;
	        if(s.charAt(s.length()-1)!=')') return false;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='('){
	                cn++;
	            }else {
	                cnt++;
	            }
	            if(cnt>cn)return false;
	        }
	        if(cn!=cnt)return false;
	        return answer;
	    }
	}
}
