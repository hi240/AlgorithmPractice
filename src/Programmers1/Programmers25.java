package Programmers1;

import java.io.IOException;
//비밀지도

public class Programmers25 {
	public static void main(String[] args) throws IOException{
		
	}
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {
    	  String[] answer = new String [n];
    	  for(int i=0;i<n;i++) {
    		  answer[i] =Integer.toBinaryString(arr1[i]|arr2[i]);
    		  answer[i]=answer[i].replace("1","#");
    		  answer[i]=answer[i].replace("0"," ");
    	      answer[i]=String.format("%"+n+"s",answer[i]);  
          }
          return answer;
    }
	
}

