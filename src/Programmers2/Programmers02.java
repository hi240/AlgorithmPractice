package Programmers2;

import java.util.Collections;
import java.util.PriorityQueue;

/*
priorities		location	return
[2, 1, 3, 2]		2			1
[1, 1, 9, 1, 1, 1]	0			5
[4, 3, 1, 2]		2			4
[1, 2, 9, 1, 1, 1]  0			6
[2, 2, 2, 2] 		2			3
[4, 3, 1, 1, 1], 	3 			4
 */
class Solution {
    public int solution(int[] priorities, int location) {
        int count = 1;
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i:priorities)
    	   pq.add(i);
       while(!pq.isEmpty()) { //pq=[9,1,1,1,1,1]
    	   for(int i=0;i<priorities.length;i++) {
    		   if(priorities[i]==pq.peek()) { //���߿��� �� ���� ���� �ɸ���!
    			   if(i==location) {
    				   return count;
    			   }
    			   count++;
    			   pq.poll();
    		   }
    	   }
       }
        return count;
    }
}

/*
���� ���� �ɸ��ɸ� ����.
�ƿ� PriorityQueue�� ���� �н��Ͽ�, �ַ���� ����.
*/