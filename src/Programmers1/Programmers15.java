package Programmers1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
//���ڿ� �� ������� �����ϱ�
public class Programmers15 {
	public static void main(String[] args) throws IOException{
		
		String[] strings= {"abce", "abcd", "cdx"};
		int n =2;
		Arrays.sort(strings);
		Arrays.sort(strings,new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				a=String.valueOf(a.charAt(n));
				b=String.valueOf(b.charAt(n));
				return a.compareTo(b);
			};
		});
		for(String a : strings) {
			System.out.println(a);
		}
	}
}
