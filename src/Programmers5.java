/*
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
����� ��
s	return
abcde	c
qwer	we
*/


class Programmers5 {
    public String solution(String s) {
        String answer = "";
        
        if(s.length()/2==0) {
        	int a= (s.length()/2); 
        	answer =s.substring(a-1,a+1); 
        }else {
        	int a= (s.length()/2)+1; 
        	answer =s.substring(a-1,a); 
        }
        
        return answer;
    }
}

