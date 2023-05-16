package D2;
import java.util.Scanner;

public class d2_2005 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int num=sc.nextInt();
            System.out.printf("#%d\n",test_case);
            solve(num);
		}
	}
    public static void solve(int n){
        int[] postarr ={}; //이 전 줄
        for(int i=0;i<n;i++){
            int[] newarr = nextarr(postarr);
            for(int j=0;j<newarr.length;j++){ //newarr 값 일렬로 출력.
                System.out.printf("%d ",newarr[j]);    
            }
            System.out.println();
            postarr=newarr.clone(); //사용한 새 줄을 전 줄로 초기화.
        }
    }
    public static int[] nextarr(int[] arr){ //다음줄을 만드는 함수
        int[] newarr = new int[arr.length+1]; //전 줄보다 한글자 더 길게
        newarr[0]=1; //첫글자와 끝글자는 1
        newarr[newarr.length-1]=1;
    	for(int i=1;i<arr.length;i++){ //가운데 숫자를 채우기
        	newarr[i]=arr[i-1]+arr[i]; //이 전 줄의 합으로
        }
        return newarr;
    }
}
