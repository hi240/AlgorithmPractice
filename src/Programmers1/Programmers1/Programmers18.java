package Programmers1;

import java.io.IOException;

//�̻��� ���� �����
public class Programmers18 {

	public static void main(String[] args) throws IOException{
	
			String s="try hello world";
			
		   String[] answer =  s.split("");
		   int j=0;
	       for(int i=0;i<answer.length;i++){
	    	  
	    	   if(answer[i].equals(" ")) j=-1;
	           if(j%2==0){
	               answer[i]=answer[i].toUpperCase();
	               System.out.println("i is "+j);
	           }else if(j%2==1){
	              answer[i]= answer[i].toLowerCase();
	              System.out.println("i2 is "+j);
	           }
	           j++;
	       }
	       s="";
	        for(String n:answer){
	            s +=n;
	        }
	        
	        System.out.println(s);
	}
}
