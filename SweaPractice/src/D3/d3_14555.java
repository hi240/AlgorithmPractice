package D3;
import java.util.Scanner;
import java.io.FileInputStream;

public class d3_14555 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
        sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++){
            String str =sc.nextLine();
            char[] ch = str.toCharArray();
            int sum = 0; // �� ����
            char post = ' '; //�� �� ���� ����
            for(int i=0;i<ch.length;i++){ //���� ũ�⸸ŭ ��ȸ
            	 if((ch[i]==')'&&post=='(')||(ch[i]=='|'&&post=='(')||(ch[i]==')'&&post=='|')){
                    sum++;
                    post=' ';
                }else if(ch[i]=='(')    post='(' ;
                 else if(ch[i]=='|')    post='|' ;
            }
            System.out.printf("#%d %d\n",test_case,sum);
		}
	}
}
