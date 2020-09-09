package Programmers1;
/*
��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��,
ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 
n	lost	reserve	return
5	[2, 4]	[1, 3, 5]	5 �� 6�̳���.
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
