package Programmers1;

/*
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�.
���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.
  s		n	result
AB		1       BC
z		1	 	 a
a B z	4	 e F d
xxXy    23   uuUv
 */

class Programmers13 {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++) {
        	char word =s.charAt(i);
        	if(word>=65&&word<91) {
        		if(word+n>=65&&word+n<91) { //�ҹ���
        			
        		}else if(word+n>=97&&word+n<123) { //�빮��
        		
        		}
        	}
        }
        return answer;
    }
}
/*
s�� �켱 char�� �ٲ㼭, Ȱ��,
����ó��: z������ a��.
*/