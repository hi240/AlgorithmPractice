import java.io.IOException;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/*
 * 
 �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
 */
/*public class Programmers1 {

public static void main(String[] args) throws IOException{
		solution("dd","dd");
	}
	
}
[leo, kiki, eden]	[eden, kiki]	= [leo]

	["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]
	��vinko �� ���;ߵǴµ� nikola������.
	["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"] ��� ��	"mislav"
*/

class Programmers1 {
    public String solution(String[] participant, String[] completion) {
    	 String answer = "";
    	for(int i=0;i<participant.length;i++) {
    		int count=0;
    		for(int j=0;j<completion.length;j++) {
    			if(participant[i].compareTo(completion[j])==0) {  //part[1]�� comp[1]�� ����. part[2]�� comp[0]�� ����.
    				participant[i]="a";  //�̹� ������ a�ιٲ����.
    				completion[j]="a";
    			}else if(participant[i].compareTo(completion[j])!=0&&!participant[i].equals("a")) { //part[1]�� comp[0]�� �ٸ���.part[2]�� comp[1]�� �ٸ���.
    				count +=1;//�����ϰ��ɼ��� ����ϴ�..
    				if(completion.length==count) {
    					answer=participant[i];
    				}
    			}
    		}
    	}
        return answer;
    }
    
}
