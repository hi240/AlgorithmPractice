package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//µ¦
public class Baekjoon10866 {
	public static void main(String[] args) {
		Deque<Integer> deq = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++) {
			order(deq,sc.nextLine());
		}
	}
	public static void order(Deque<Integer> deq,String str) {
		String[] st =str.split(" ");
		switch(st[0]) {
			case "push_front": deq.offer(Integer.parseInt(st[1])); break;
			case "push_back": deq.offerLast(Integer.parseInt(st[1])); break;
			case "pop_front": deq.poll(); if(deq.peek()==null) System.out.println("-1");
			else System.out.println(deq.poll()); break;
			case "pop_back": deq.poll(); if(deq.peek()==null) System.out.println("-1");
			else System.out.println(deq.pollLast()); break;
			case "size" : System.out.println(deq.size()); break;
			case "empty" : if(deq.isEmpty()) System.out.println("1");
			else System.out.println("0"); break;
			case "front" : if(deq.peek()==null) System.out.println("-1");
			else System.out.println(deq.poll()); break;
			case "back": if(deq.peek()==null) System.out.println("-1");
			else System.out.println(deq.pollLast()); break;
		}
	}
}
