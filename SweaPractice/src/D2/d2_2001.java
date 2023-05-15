package D2;

import java.util.Scanner;
public class d2_2001 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            //값입력
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
            		arr[i][j]=sc.nextInt();
                }
            }
            int max=0; //최댓값
            for(int i=0;i<n-k+1;i++){ //i,j에서 벽을 초과하지 않을 정도만 돌게 설정.
            	for(int j=0;j<n-k+1;j++){
               		int sum=0;	//각 구간별 합
       		 		for(int x=i ; x<i+k ; x++){ // (i,j)에서부터 정사각형범위 순회
             			for(int y=j ; y<j+k ; y++){
                            sum += arr[x][y];
                        }
                    }
                    max=Math.max(max,sum); //더큰수로 업뎃
                }
             }
             System.out.printf("#%d %d\n",test_case,max);
		}
	}
}
