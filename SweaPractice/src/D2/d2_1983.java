package D2;

import java.util.Scanner;

public class d2_1983 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
	        int N = sc.nextInt(); //학생의 수
	        int K = sc.nextInt(); //알고싶은 학생
	        double[] score = new double[N+1]; //각 학생의 점수 저장
	        for(int i=0;i<N;i++){
	            score[i+1]=(sc.nextInt()*0.35)+(sc.nextInt()*0.45)+(sc.nextInt()*0.2); //총점
	        }
	        int rank =0;
	        for(int i=1;i<=N;i++){
	        	if(score[i]>=score[K]) rank++; //K학생의 순위 구함.
	        }
	        int min = N/10 ; //한 점수당 가능한 학생 수
	        if(rank<=min) System.out.printf("#%d A+\n",test_case);
	        else if(rank<=min*2) System.out.printf("#%d A0\n",test_case);
	        else if(rank<=min*3) System.out.printf("#%d A-\n",test_case);
	        else if(rank<=min*4) System.out.printf("#%d B+\n",test_case);
	        else if(rank<=min*5) System.out.printf("#%d B0\n",test_case);
	        else if(rank<=min*6) System.out.printf("#%d B-\n",test_case);
	        else if(rank<=min*7) System.out.printf("#%d C+\n",test_case);
	        else if(rank<=min*8) System.out.printf("#%d C0\n",test_case);
	        else if(rank<=min*9) System.out.printf("#%d C-\n",test_case);
	        else if(rank<=min*10) System.out.printf("#%d D0\n",test_case);
		}
	}
}
