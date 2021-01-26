package Programmers2;

import java.io.IOException;
import java.util.Scanner;
//124나라 실패
public class Programmers17 {
	public static void main(String[] args) throws IOException{
	        StringBuffer sb = new StringBuffer();
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	            //4진법재현해보자.
	            //숫자 8 이있다.
	        while(n/3>0){
	            sb.append(n%3);
	            n /=3;
	        }
	        sb.append(n);
	        sb.reverse();
	        String answer = sb.toString();
	        answer.replace('0', '1');
	        answer.replace('1', '2');
	        answer.replace('2', '4');
	        System.out.println(sb);
	         System.out.println(n+" n");
	         
	         char[] arr = {'1','2'};
	         arr.toString();
}
}