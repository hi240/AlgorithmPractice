package Programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

//두 개 뽑아서 더하기
public class PickAndPlus {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		solution(numbers);
	}
    public static int[] solution(int[] numbers) {
		ArrayList<Integer> arr =new ArrayList<Integer>();
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				int num = numbers[i]+numbers[j];
				if(arr.indexOf(num)<0) {
					arr.add(num);
				}
			}
		}
		int[] answer= new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			answer[i]=arr.get(i);
		}
        Arrays.sort(answer);
        return answer;
    }
}
