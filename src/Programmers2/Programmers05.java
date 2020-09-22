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
			System.out.println("�Ӱ�");
			while(weight>bridge_weights) {
				if(!queue.isEmpty()) {
				bridge_weights += queue.poll();
				time++;
				}
				break;
			}
			time++;
		}
		System.out.println("�ð�"+time);
	}
	}
}
/* �ٸ��� ������ Ʈ��
Ʈ���� 1�ʿ� 1��ŭ
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
truck�� queue�� ���´ٰ� ġ��.
Ʈ���� ���Ҹ� ���ʴ�� .peek�� �ؼ� Ȯ���� �ؼ�
<weight ���� ���� �༮�� �� ���� �� �ְ� �Ѵ�.
�ٸ��� ���� �ִ� weight�� ���� ������ �ʿ�. bridge_weights
�ʸ� ���� ������ �ʿ�. time

*/