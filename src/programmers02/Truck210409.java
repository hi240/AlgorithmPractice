package programmers02;

import java.util.LinkedList;
import java.util.Queue;

public class Truck210409 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum=0;
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i:truck_weights) {
        	while(true) {
        		if(que.isEmpty()) {
        			que.offer(i);
        			answer++;
        			sum+=i;
        			break;
        		}else if(bridge_length==que.size()) {
        			sum-=que.poll();
        		}else {
        			if(i+sum>weight) {
        				que.offer(0);
        				answer++;
        			}else {
        				que.offer(i);
        				sum+=i;
        				answer++;
        			}
        		}
        	}
        }
        return answer+bridge_length;
    }
}
