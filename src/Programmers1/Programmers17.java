package Programmers1;

import java.io.IOException;

/*시저암호
 * 
 * 
 */
public class Programmers17 {
	public static void main(String[] args) throws IOException{
		
			String s="z";
			int n =1;
			
		    String answer = "";
	        String[] word = s.split("");
	        
			for(int i=0;i<word.length;i++) {
	            char b=word[i].charAt(0); 
				if(b>=65 && b<=90){
	                b +=n; 
	                if(b>90){
	                	 b = (char)(64+(b%90));
	                }
	            }
	            if(b>=97 && b<=122){
	                 b +=n; 
	                if(b>122){
	                    b = (char)(96+(b%122));
	                }
	            }
	            word[i]=String.valueOf(b);
			}
	        for(String a:word){
	            answer += a;
	        }
	        
	        System.out.println(answer);
	}
}
