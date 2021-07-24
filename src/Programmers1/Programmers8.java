/*
2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��?
�� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�.
���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.

���� ����
2016���� �����Դϴ�.
2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
a	b	result
5	24	TUE
31�� 1��,3,5,7,8,10,12
30�� 6��,4,9,11
29�� 2��
 */
class Programmers8 {
    public String solution(int a, int b) {
    	int day =0;
        String answer = "";
        String week[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        for(int i=1;i<a;i++) {
        	if(i==4||i==6||i==9||i==11) {
        		day +=30;
        	}else if(i==2) {
        		day += 29;
        	}else {
        		day += 31;
        	}
        }
        day +=b;
        answer=week[day%7];
        return answer;
    }
}
/*
Ǫ�µ� �� �����ɸ���.. ��Ʈ�� �� ����.
 */