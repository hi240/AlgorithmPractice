package Programmers1;
class Programmers9 {
    public String solution(String[] seoul) {
        int num=0;
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		num=i;
        	}
        }
        String answer="김서방은 "+num+"에 있다";
        return answer;
    }
}
//딱 5분걸린 기초 문제