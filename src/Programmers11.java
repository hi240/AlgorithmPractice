/*���ڿ� �ٷ�� �⺻
���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
����� ��
s	return
a234	false
1234	true
 */
class Programmers11 {
    public boolean solution(String s) {
        boolean answer = false;
        try {
	        if(s.length()==4||s.length()==6) {
	        	Integer.parseInt(s);
	        	answer=true;
			}
        } catch (Exception e) {
        	answer= false;
		}
        
        
        return answer;
    }
}