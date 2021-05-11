package Stack;

import java.util.Scanner;
import java.util.Stack;

//Á¦·Î
public class baekjoon10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Stack<Integer> stk = new Stack<Integer>();
		for(int i=0;i<num;i++) {
			int n=sc.nextInt();
			if(n==0) stk.pop();
			else {
				stk.add(n);
			}
		}
		int sum=0;
		while(!stk.isEmpty()) {
			sum +=stk.pop();
		}
		System.out.println(sum);
	}
}
