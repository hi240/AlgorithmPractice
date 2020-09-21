package Programmers2;

import java.util.ArrayList;

/*
��ɰ���
progresses						speeds			return
[93, 30, 55]					[1, 30, 5]		[2, 1]
[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]

���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.
��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, �̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.
���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� �� �۾��� ���� �ӵ��� ����
���� �迭 speeds�� �־��� �� �� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

����� �� #1
ù ��° ����� 93% �Ϸ�Ǿ� �ְ� �Ϸ翡 1%�� �۾��� �����ϹǷ� 7�ϰ� �۾� �� ������ �����մϴ�.
�� ��° ����� 30%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 30%�� �۾��� �����ϹǷ� 3�ϰ� �۾� �� ������ �����մϴ�. ������ ���� ù ��° ����� ���� �ϼ��� ���°� �ƴϱ� ������ ù ��° ����� �����Ǵ� 7��° �����˴ϴ�.
�� ��° ����� 55%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 5%�� �۾��� �����ϹǷ� 9�ϰ� �۾� �� ������ �����մϴ�.

���� 7��°�� 2���� ���, 9��°�� 1���� ����� �����˴ϴ�.
 */
public class Programmers04 {
	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	      int[] count = new int [progresses.length];
	    	for(int i=0;i<progresses.length;i++) {
	    		while(progresses[i]<100) { 
	    		progresses[i] +=speeds[i];  
	    		count[i]++; 
	    		}
	    	}
	    	ArrayList<Integer> arr = new ArrayList<>();
	    	arr.add(1);
	    	for(int i=1;i<progresses.length;i++) { 
	    		if(count[i-1]>=count[i]) { 
	    			count[i]=count[i-1];
	    			arr.set(arr.size()-1, arr.get(arr.size()-1)+1);
	    		}else {
	    			arr.add(1);
	    		}
	    	}
	    	int[] answer = new int [arr.size()];
	    	for(int i=0;i<answer.length;i++) {
	    		answer[i]=arr.get(i);
	    	}
	        return answer;
	    }
	}
}