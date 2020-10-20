package Programmers2;

import java.util.Arrays;

//전화번호 목록

class Programmers12 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0;i<phone_book.length;i++) {
        	for(int j=i+1;j<phone_book.length;j++) {
            	if(phone_book[j].startsWith(phone_book[i])||phone_book[i].startsWith(phone_book[j])) {
            		return false;
            	}
            }
        }
        return answer;
    }
}
/*두번째풀이
class Programmers12 {
    public boolean solution(String[] phone_book) {
       	Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++) {
        	if(phone_book[i+1].startsWith(phone_book[i])){
        		return false;
       		}
        }
        return answer;
    }
}
*/