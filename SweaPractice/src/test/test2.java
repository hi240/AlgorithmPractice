package test;

import java.util.Scanner;

class test2
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++){
            int N= sc.nextInt();
            int answer = 0;
            boolean chk=false;
            int[] item = new int[21];
            for(int i=0;i<N;i++){ //예를들어 10번 반복한다.
            	int buy = sc.nextInt(); //1 팔러 -1 사러
                int cost = sc.nextInt(); //가격
                if(buy==1&&!chk) {
                	chk= true;
                	item[cost]++; //재고가 있게끔 표시.
                }
                else if(buy==-1 && item[cost]>0) { //살려고 왔는데, 재고도 있어
                	answer += cost;
                	chk = false;
                }
            }
			System.out.printf("#%d %d\n",test_case,answer);
		}
		sc.close();
	}
}