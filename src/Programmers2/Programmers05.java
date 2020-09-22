package Programmers2;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers05 {
	public static void main(String[] args) throws IOException{
		
	int bridge_length=100;
	int weight =100;
	int[] truck_weights = {10};
	int bridge_weights=0;
	int time =0;
	Queue<Integer> queue = new LinkedList<Integer>();
	for(int i=0;i<truck_weights.length;i++) {
		queue.add(truck_weights[i]);
	}

	while(!queue.isEmpty()) {
		while(bridge_length>0) {
			queue.poll();
			time++;
			bridge_length--;
			System.out.println("머고");
			while(weight>bridge_weights) {
				if(!queue.isEmpty()) {
				bridge_weights += queue.poll();
				time++;
				}
				break;
			}
			time++;
		}
		System.out.println("시간"+time);
	}
	}
}
/* 다리를 지나는 트럭
트럭은 1초에 1만큼
bridge_length	weight	truck_weights	return
		2		10		[7,4,5,6]		8
 */
/*
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    	int bridge_weights=0;
    	int time =0;
    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	for(int i:truck_weights) {
    		queue.add(truck_weights[i]);
    	}
    	while(!queue.isEmpty()) {
    		while(weight>bridge_weights) {
    			bridge_weights += queue.poll();
    			time++;
    		}
    		time++;
    	}
        int answer = time;
        return answer;
    }
}
*/
/*
truck을 queue로 놓는다고 치자.
트럭의 원소를 차례대로 .peek을 해서 확인을 해서
<weight 보다 작은 녀석은 다 들어올 수 있게 한다.
다리에 현재 있는 weight에 대한 변수가 필요. bridge_weights
초를 세는 변수가 필요. time

*/