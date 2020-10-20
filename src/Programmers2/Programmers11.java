package Programmers2;
//Ä«Æê
public class Programmers11 {
	    public int[] solution(int brown, int yellow) {
	        int[] answer = new int[2];
	        int num = brown+yellow;
	        for(int i=num;i>=1;i--){
	            if(brown==(i+(brown+yellow)/i)*2-4){                
	                answer[0]=i;
	                int b = (brown+yellow)/i;
	                if(brown+yellow==i*b){
	                  answer[1]=b;
	                    break;
	                }else{
	                    continue;
	                }
	            }
	        }
	        return answer;
	    }
}
