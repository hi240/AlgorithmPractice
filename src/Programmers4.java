import java.io.IOException;
import java.util.ArrayList;

/*
전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 
n	lost	reserve	return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]    		4
3	[3]	    [1]			2
4	[1]		[2]			3+a
4	[1,2]	[2]			3
5	[2,5]	[2]			4 이 3나왔음
*/

class Programmers4 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer> result = new ArrayList<>();
        int[] chance = new int[reserve.length];
     
        for(int i=0;i<reserve.length;i++) { //이건 1번 돈다.
        	result.add(reserve[i]); //result[2]
        	
        	int a=reserve[i]+1;  //a=3
       		int b = reserve[i]-1;  //b=1
        
       		for(int j=0;j<lost.length;j++) { //2번돈다.
       			if(lost[j]==reserve[i]) { //[2]==[2]므로,
       				chance[i]++; //chance[0]++ 된다.
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
