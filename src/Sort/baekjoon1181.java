package Sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//단어 정렬
public class baekjoon1181 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int testnum = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[testnum];
		for(int i=0;i<testnum;i++) {
			arr[i]=sc.nextLine();
		}
		Arrays.sort(arr,new Comparator<String>(){
			@Override
			public int compare(String a,String b) {
				if(a.length()==b.length()) {
					return a.compareTo(b);
				}else {
					int c=a.length();
					int d=b.length();
					return c-d;
				}
			}
		});
		//배열의 중복 제거해서 출력하기
		System.out.println(arr[0]);
		for(int i=1;i<testnum;i++) {
			if(arr[i-1].equals(arr[i])) {
				continue;
			}else {
				System.out.println(arr[i]);
			}
		}
	}
}
