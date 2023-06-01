package test;

import java.util.Scanner;

class java
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++){
            int answer=0;
            int N= sc.nextInt();
            int post =0;
            for(int i=0;i<N;i++){
                int loc= sc.nextInt(); //ÁÂÇ¥
                int power= sc.nextInt(); //°­µµ
                if(loc>post){
                    answer++;
                    post = loc+power;
                }else if(loc<=post)  continue;
            }
			System.out.printf("#%d %d\n",test_case,answer);
		}
		sc.close(); 
	}
}
