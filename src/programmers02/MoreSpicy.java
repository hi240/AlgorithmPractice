package programmers02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//더 맵게 - 시간초과
public class MoreSpicy {
	public static void main(String[] args) {
		int[] arr = {10,20,30,90,10,12};
		System.out.println(solution(arr,5));
	}
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<scoville.length;i++){
            arr.add(scoville[i]);
        }
        while(arr.get(0)<K){
        	if(arr.size()==1) return -1;
            int temp = arr.get(0)+(arr.get(1)*2);
            arr.add(temp);
            arr.remove(0);
            arr.remove(0);
            Collections.sort(arr);
            answer++;
        }
        return answer;
    }
}
