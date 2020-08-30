import java.io.IOException;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/*
 * 
 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
 */
/*public class Programmers1 {

public static void main(String[] args) throws IOException{
		solution("dd","dd");
	}
	
}
[leo, kiki, eden]	[eden, kiki]	= [leo]

	["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]
	ㄴvinko 가 나와야되는데 nikola가나옴.
	["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"] 기댓값 〉	"mislav"
*/

class Programmers1 {
    public String solution(String[] participant, String[] completion) {
    	 String answer = "";
    	for(int i=0;i<participant.length;i++) {
    		int count=0;
    		for(int j=0;j<completion.length;j++) {
    			if(participant[i].compareTo(completion[j])==0) {  //part[1]과 comp[1]은 같다. part[2]와 comp[0]은 같다.
    				participant[i]="a";  //이미 같은건 a로바꿔벌임.
    				completion[j]="a";
    			}else if(participant[i].compareTo(completion[j])!=0&&!participant[i].equals("a")) { //part[1]과 comp[0]은 다르다.part[2]와 comp[1]은 다르다.
    				count +=1;//범인일가능성을 통과하는..
    				if(completion.length==count) {
    					answer=participant[i];
    				}
    			}
    		}
    	}
        return answer;
    }
    
}
