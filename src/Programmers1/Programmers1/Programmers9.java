package Programmers1;
class Programmers9 {
    public String solution(String[] seoul) {
        int num=0;
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		num=i;
        	}
        }
        String answer="�輭���� "+num+"�� �ִ�";
        return answer;
    }
}
//�� 5�аɸ� ���� ����