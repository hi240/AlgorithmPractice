package Programmers1;

import java.io.IOException;
import java.util.ArrayList;
//자연수 거꾸로
public class Programmers19 {

	public static void main(String[] args) throws IOException{
		
		long n= 1234;
	
		        Integer k = (int)(long) n;
		        
		        ArrayList<Integer> arr = new ArrayList<>();
		        while(k>0){
		            arr.add(k%10);
		            k /= 10;
		        }
		         int[] answer =new int [arr.size()];
		        for(int i=0;i<answer.length;i++){
		            answer[i]=arr.get(i);
		        }
		        System.out.println(answer[0]);
		    }
		
	}

