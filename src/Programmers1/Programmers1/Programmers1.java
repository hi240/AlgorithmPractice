package Programmers1;
import java.util.Arrays;


/*
 * 
 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
 */
/*
public class Programmers1 {

public static void main(String[] args) throws IOException{
		solution("dd","dd");
	}
	
}
[leo, kiki, eden]	[eden, kiki]	= [leo]


    participant-["ana","mislav", "mislav", "stanko"]
	completion1-["ana","mislav", "mislav"]
	completion2-["ana","mislav", "stanko"]
*/

class Programmers1 {
    public String solution(String[] participant, String[] completion) {
        
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	int i=0;
    	for(i=0;i<completion.length;i++) {
    		if(!participant[i].equals(completion[i])){
    			return participant[i];
    		}
    	}
        return participant[i];
        
    }
}
