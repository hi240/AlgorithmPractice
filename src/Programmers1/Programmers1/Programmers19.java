package Programmers1;

import java.io.IOException;
import java.util.ArrayList;
//�ڿ��� �Ųٷ� long casting �ϴµ��� �ð� ���� �ɷ���..
public class Programmers19 {

class Solution {
    public int[] solution(long n) {
		        ArrayList<Integer> arr = new ArrayList<>();
		        while(n>0){
		            arr.add((int)(n%10));
		            n = n / 10;
		        }
		        int[] answer =new int [arr.size()];
		        for(int i=0;i<answer.length;i++){
		            answer[i]=arr.get(i);
		        }
        return answer;
    }
}

	}

