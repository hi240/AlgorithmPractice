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
	        
			for(String a: word) {
	            char b=a.charAt(0);
				if(b>=65 && b<=90){
	                b +=n;
	                if(b>90){
	                    b %= 65;
	                }
	            }
	            if(b>=97 && b<=122){
	                 b +=n;
	                if(b>122){
	                    b %= 65;
	                    System.out.println(b);
	                }
	            }
	            a=String.valueOf(b);
			}
	        for(String a:word){
	            answer += a;
	        }
	        
	        System.out.println(answer);
	}
}
