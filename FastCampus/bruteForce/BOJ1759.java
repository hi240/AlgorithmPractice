package bruteForce;

import java.util.Scanner;

//암호 만들기
public class BOJ1759 {
	public static int L,C;
	public static int[] arr;
	public static StringBuffer sb =new StringBuffer();
	
	public static void main(String[] args) {
		input();
		dfs(0,"");
		System.out.println(sb.toString());
	}
	public static void dfs(int depth,String str) {
		if(depth==L) {
			if(!vowelcheck(str)) return;
			sb.append(str).append('\n');
			return;
		}else {
			for()
		}
	}
	public static boolean vowelcheck(String str) { //1개이상의 모음가졋는지 체크
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
		}
		return false;
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		L=sc.nextInt();
		C=sc.nextInt();
		arr= new int[C];
		for(int i=0;i<C;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
}
