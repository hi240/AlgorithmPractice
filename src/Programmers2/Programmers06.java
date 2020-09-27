package Programmers2;

import java.io.IOException;

public class Programmers06 {
	public static void main(String[] args) throws IOException{ //cbdc나와야되는데 bbcdc
		String k="abc"; 
		String m="acbbcdc";
		int p=0;
		for(int j=0;j<k.length();j++) { //abc
			for(int i=p;i<m.length();i++) { //acbbcdc
				if(k.charAt(j)==m.charAt(i)) { 
					m = m.substring(0,i) + m.substring(i+1);
					p=i;
					System.out.println(m);
					break;
				}
			}
		}
		System.out.println(m);
	}
}

/*
 * 
 public class Programmers06 {
	public static void main(String[] args) throws IOException{ //cbdc나와야되는데 bcdc나옴.
		String m="acbbcdc";
		String k="abc"; 
		int order=0;
		for(int i=0;i<m.length();i++) {
			for(int j=0;j<k.length();j++) {
				if(m.charAt(i)==k.charAt(j)) { //i보다 큰,,, 놈을 치환시켜야됨.
					System.out.println("i의값 "+i);
					m=m.replaceFirst(m.substring(0,i+1),""); //m.substring(0)을공백으로바꿨음.
					k=k.replaceFirst(k.substring(j,j+1),"");
					System.out.println("m "+m);
					System.out.println("k "+k);
					order++;
					break;
				}
			}
		}
		System.out.println(m);
	}
}
 */

/*
	m		k		result
"kkaxbycyz"	"abc"	"kkxyyz"
"acbbcdc"	"abc"	"cbdc"
 */
/*
class Solution {
	public String solution(String m, String k) {
		
		for(int i=0;i<m.length();i++) {
			for(int j=0;j<k.length();j++) {
				if(m.charAt(i)==k.charAt(j)) { //i=0일때, k=여러번돈다,
					m.replaceFirst(m.substring(i,m.length()),"");
					m.subs
					break;
				}
			}
		}
		
		return m;
	}
	
}
*/