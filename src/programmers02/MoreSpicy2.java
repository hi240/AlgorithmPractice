package programmers02;

import java.util.PriorityQueue;
import java.util.Queue;

//´õ ¸Ê°Ô
public class MoreSpicy2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,8,10,12};
		System.out.println(solution(a,7));
	}
	public static int solution(int[] scoville, int K) {
       int answer = 0;
        Queue<Integer> q = new PriorityQueue<Integer>();
         for(int i=0;i<scoville.length;i++){
            q.add(scoville[i]);
        }
        while(q.peek()<K){
            if(q.size()==1) return -1;
            int sum= q.poll()+(q.poll()*2);
            q.add(sum);
            answer++;
        }
        return answer;
    }
}
