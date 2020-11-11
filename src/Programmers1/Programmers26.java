package Programmers1;

import java.io.IOException;
import java.util.ArrayList;
//같은 숫자는 싫어
public class Programmers26 {
	public static void main(String[] args) throws IOException{
		int[] arr = {};
		 ArrayList<Integer> index = new ArrayList<Integer>();
	        index.add(arr[0]);
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]!=arr[i-1]){
	                index.add(arr[i]);
	            }
	        }
	        int[] answer = new int[index.size()];
	        for(int i=0;i<answer.length;i++) {
	        	answer[i]=index.get(i);
	        }
	        //return answer;
	}
}
