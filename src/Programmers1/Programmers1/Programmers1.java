package Programmers1;
import java.util.Arrays;


/*
 * 
 �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
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
