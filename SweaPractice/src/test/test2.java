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
            for(int i=0;i<N;i++){ //������� 10�� �ݺ��Ѵ�.
            	int buy = sc.nextInt(); //1 �ȷ� -1 �緯
                int cost = sc.nextInt(); //����
                if(buy==1&&!chk) {
                	chk= true;
                	item[cost]++; //��� �ְԲ� ǥ��.
                }
                else if(buy==-1 && item[cost]>0) { //����� �Դµ�, ��� �־�
                	answer += cost;
                	chk = false;
                }
            }
			System.out.printf("#%d %d\n",test_case,answer);
		}
		sc.close();
	}
}