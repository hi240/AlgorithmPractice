package D2;
import java.util.Scanner;

public class d2_1979 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] arr = new int[N][N];
            //입력받기
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                	arr[i][j]=sc.nextInt();
                }
            }
            int sum=0;
            for(int i=0;i<N;i++){ //가로 확인
                int cnt=0;
                for(int j=0;j<N;j++){
                	if(arr[i][j]==0){ //검정색일경우
                    	if(cnt==K){ //이 전 칸까지 K만큼 누적되어있었다면
                            sum++;
                        	cnt=0;
                        }else cnt=0;
                    }else if(arr[i][j]==1){
                    	cnt++;
                    }
                }
                if(cnt==K) sum++;
            }
          for(int i=0;i<N;i++){ //세로 확인
                int cnt=0;
                for(int j=0;j<N;j++){
                	if(arr[j][i]==0){ //검정색 일경우
                    	if(cnt==K){ //이 전 칸까지 K만큼 누적되어있었다면
                            sum++;
                        	cnt=0;
                        }else cnt=0;
                    }else if(arr[j][i]==1){
                    	cnt++;
                    }
                }
               if(cnt==K) sum++;
            }
			System.out.printf("#%d %d\n",test_case,sum);
		}
	}
}
