package Programmers1;
/*
전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 
n	lost	reserve	return
5	[2, 4]	[1, 3, 5]	5 가 6이나옴.
5	[2, 4]	[3]    		4
3	[3]	    [1]			2
4	[1]		[2]			3+a
4	[1,2]	[2]			3
5	[2,5]	[2]			4

*/

class Programmers4 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n-lost.length;
        for(int i=0;i<reserve.length;i++) {
        	for(int j=0;j<lost.length;j++) {
        		if(lost[j]==reserve[i]) {
        			answer++;
        			reserve[i]=0;
        			lost[j]=-10;
        		}
        	}
        }
        for(int i=0;i<reserve.length;i++) {
        	for(int j=0;j<lost.length;j++) {
		        if(reserve[i]!=0&&lost[j]==reserve[i]+1||lost[j]==reserve[i]-1) { 
		        	answer++;
		        	reserve[i]=0;
		        	lost[j]=-10;
		        }
        	}
        }
        return answer;
    }
}
