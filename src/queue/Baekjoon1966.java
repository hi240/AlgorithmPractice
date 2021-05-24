package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//������ ť
class PQ{
	int que;
	int index;
	PQ(int que,int index){
		this.que=que;
		this.index=index;
	}
}
public class Baekjoon1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int i=0;i<testcase;i++) {
			int len = sc.nextInt();
			int num = sc.nextInt();
			int[] arr = new int[len];
			Queue<PQ> q = new LinkedList<>();
			for(int j=0;j<len;j++) {
				arr[j]=sc.nextInt();
				q.offer(new PQ(arr[j],j));
			}
			solution(q,num);
		}
	}
	public static void solution(Queue<PQ> q,int num) {
		int max = 0;
		int count=1;
		while(!q.isEmpty()) {
			//Que���� �ִ밪 ���ϱ�
			for(int i=0;i<q.size();i++) {
				if(max<q.peek().que) {
					PQ pq = q.poll();
					max=pq.que;
					q.offer(new PQ(max,pq.index));
				}else {
					PQ pq = q.poll();
					q.offer(new PQ(pq.que,pq.index));
				}
			}
			//�μ�
			for(int i=0;i<q.size();i++) {
				if(q.peek().que==max) {
					if(q.peek().index==num) {
						System.out.println(count);
						q.clear(); //while�� ����
					}
					q.poll();
					max=0; //�ִ밪 �ʱ�ȭ
					break;
				}else {
					PQ pq = q.poll();
					q.offer(new PQ(pq.que,pq.index));
				}
			}
			count++;
		}
		
	}
}

