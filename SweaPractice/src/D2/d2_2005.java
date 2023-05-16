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
        int[] postarr ={}; //�� �� ��
        for(int i=0;i<n;i++){
            int[] newarr = nextarr(postarr);
            for(int j=0;j<newarr.length;j++){ //newarr �� �Ϸķ� ���.
                System.out.printf("%d ",newarr[j]);    
            }
            System.out.println();
            postarr=newarr.clone(); //����� �� ���� �� �ٷ� �ʱ�ȭ.
        }
    }
    public static int[] nextarr(int[] arr){ //�������� ����� �Լ�
        int[] newarr = new int[arr.length+1]; //�� �ٺ��� �ѱ��� �� ���
        newarr[0]=1; //ù���ڿ� �����ڴ� 1
        newarr[newarr.length-1]=1;
    	for(int i=1;i<arr.length;i++){ //��� ���ڸ� ä���
        	newarr[i]=arr[i-1]+arr[i]; //�� �� ���� ������
        }
        return newarr;
    }
}
