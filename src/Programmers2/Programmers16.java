package Programmers2;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers16 {
	
	    public String solution(int[] numbers) {
	        String[] answer = new String [numbers.length];
	        for(int i=0;i<numbers.length;i++){
	           answer[i] = String.valueOf(numbers[i]);
	        }
	        Arrays.sort(answer,new Comparator<String>(){
	            @Override
	            public int compare(String a, String b){
	                return (b+a).compareTo(a+b);
	            }
	        });
	        if(answer[0].startsWith("0")){
	            return "0";
	        }
	        String temp ="";
	        for(String a : answer) {
	            temp += a;
	        }
	        return temp;
	    }
	
}
