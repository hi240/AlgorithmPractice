package Programmers1;
/*
���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
���� ����
n�� ���� 10,000������ �ڿ����Դϴ�.
����� ��
n	return
3	���ڼ�
4	���ڼ���
 */
class Programmers10 {
    public String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++) {
        	if(i%2==0) {
        		answer +="��";
        	}else {
        		answer +="��";
        	}
        }
        return answer;
    }
}
//÷�� ��ư� �����ߴٰ� ��? �̷��� 2�и���ǰ