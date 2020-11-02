package Programmers1;

import java.io.IOException;
import java.util.ArrayList;
//자연수 거꾸로 long casting 하는데에 시간 많이 걸렸음..
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

