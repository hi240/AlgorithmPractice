package Programmers1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;

public class Programmers19 {

	public static void main(String[] args) throws IOException{
		
		int a = 1234;
		int[] answer = {};
		int i=0;
		while(a>0) {
			answer[i]= a%10;
			a /=10;
			i++;
		}
		String[] s= {"d","s"};
		
		for(int i=0;i<s.length;i++) {
			s[s.length-i] = s[i];
		}
		
	}
}
