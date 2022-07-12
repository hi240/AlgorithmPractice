package Programmers1;

import java.io.IOException;

public class Programmers21 {

	class Solution {
	    public int solution(int num) {
	        int nume = num;
	        int count = 0;
	      while(nume!=1){
	          count++;
	            if(nume%2==0){
	                nume = nume/2;
	                if(nume==1) break;
	            }
	            else if(nume%2==1){
	                nume = (nume*3)+1;
	                if(nume==1) break;
	            }
	          if(count>500){
	            count = -1;
	              break;
	          }
	      }
	        return count;
	    }
	}
}
