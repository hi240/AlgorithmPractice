package Baekjoon2;

import java.util.Scanner;
public class Baekjoon2292 {

		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int sum =1;
	    int i =0;
	    
	    while(i>=0){
	        i++;
	        sum += 6*i;
	        if(n==1)break;
	        else if(n<=sum){
	            i++;
	            break;
	        }else{
	            continue;
	        }
	    }
	        
	    System.out.println(i);
	        
	}
}
