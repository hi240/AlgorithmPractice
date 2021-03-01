package backTracking;

import java.util.Arrays;
import java.util.Scanner;

//��ȣ �����
public class Baekjoon1759 {
	public static int size;
	public static int num;
	public static char[] arr;
	public static boolean[] visit;
	public static StringBuffer sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		size= sc.nextInt();
		num= sc.nextInt();
		arr=new char[num];
		visit= new boolean[num];
		String sentence = sc.nextLine();
		sc.close();
		sentence.replace(" ","");
		arr=sentence.toCharArray();
		Arrays.sort(arr);//�������� ���� ��. ���� ���⸸ �ϸ� ��.
		sb=new StringBuffer();
		dfs(0,0,"");
	}
	
	public static void dfs(int at,int depth,String pass) {
		if(at==depth) {
			
			return;
		}
		for(int i=at;i<num;i++) {
			if(!visit[i]) {
				visit[i] = true;
				dfs(i+1,depth+1,pass+"d");
				
				visit[i] = false;
			}
		}
		
	}
}
