package Programmers1;

import java.io.IOException;

//이상한 문자 만들기
public class Programmers18 {

	public static void main(String[] args) throws IOException{
	
			String s="try one";
			
		   String[] answer =  s.split("");
		   
	       for(int i=0;i<answer.length;i++){
	           if(i%2==0){
	               answer[i]=answer[i].toUpperCase();
	               System.out.println("i is "+i);
	           }else if(i%2==1){
	              answer[i]= answer[i].toLowerCase();
	              System.out.println("i2 is "+i);
	           }
	       }
	       s="";
	        for(String n:answer){
	            s +=n;
	        }
	        
	        System.out.println(s);
	}
}
