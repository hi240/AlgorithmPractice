package Programmers1;

import java.io.IOException;
//ÇÏ»þµå ¼ö
public class Programmers22 {

	public static void main(String[] args) throws IOException{
		
		System.out.println(solution(11));
	}

	public static boolean solution(int x) {
        boolean answer = true;
        int X =x;
        int a=0;
        int order=1;
        while(x>0){
            a += x %10*order;
            System.out.println(a);
            order *=10;
            x /=10;
        }
        if(X%a!=0) answer=false;
        return answer;
    }

}
