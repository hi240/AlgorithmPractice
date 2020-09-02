import java.io.IOException;
import java.util.ArrayList;

/*
��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��,
ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 
n	lost	reserve	return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]    		4
3	[3]	    [1]			2
4	[1]		[2]			3+a
4	[1,2]	[2]			3
5	[2,5]	[2]			4 �� 3������
*/

class Programmers4 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer> result = new ArrayList<>();
        int[] chance = new int[reserve.length];
     
        for(int i=0;i<reserve.length;i++) { //�̰� 1�� ����.
        	result.add(reserve[i]); //result[2]
        	
        	int a=reserve[i]+1;  //a=3
       		int b = reserve[i]-1;  //b=1
        
       		for(int j=0;j<lost.length;j++) { //2������.
       			if(lost[j]==reserve[i]) { //[2]==[2]�Ƿ�,
       				chance[i]++; //chance[0]++ �ȴ�.
       				answer++;
       			}else if(chance[i]==0) {
	        		if(lost[j]==a) { 
	        			if(!result.contains(a)) { 
	        				result.add(a); 
	        				chance[i]++;
	        			}
	        		}else if(lost[j]==b) { 
	        			if(!result.contains(b)) { 
	        				result.add(b); 
	        				chance[i]++;
	        			}
	        		}
       			}
        	}
        }
        int add = lost.length+reserve.length;
        answer= result.size()+(n-add); //answer=1+(5-3);
        return answer;
    }
    
}
