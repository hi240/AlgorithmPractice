package D2;

import java.util.Scanner;
public class d2_2001 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            //���Է�
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
            		arr[i][j]=sc.nextInt();
                }
            }
            int max=0; //�ִ�
            for(int i=0;i<n-k+1;i++){ //i,j���� ���� �ʰ����� ���� ������ ���� ����.
            	for(int j=0;j<n-k+1;j++){
               		int sum=0;	//�� ������ ��
       		 		for(int x=i ; x<i+k ; x++){ // (i,j)�������� ���簢������ ��ȸ
             			for(int y=j ; y<j+k ; y++){
                            sum += arr[x][y];
                        }
                    }
                    max=Math.max(max,sum); //��ū���� ����
                }
             }
             System.out.printf("#%d %d\n",test_case,max);
		}
	}
}
