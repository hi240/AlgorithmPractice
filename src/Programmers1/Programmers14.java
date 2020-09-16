package Programmers1;

import java.util.Arrays;

public class Programmers14 {

}
/*
d	     	   budget	result
[1,3,2,5,4]		 9		  3
[2,2,3,3]		 10		  4

 */
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); //[1,2,3,4,5]
        int count=0;
        int sum=0;
        for(int i=0;i<d.length;i++) {
        	if(sum>budget) break;
        	sum += d[i];
        	count++;
        }
        return count;
    }
}

/*
최대 경우의 수 구하기.

*/