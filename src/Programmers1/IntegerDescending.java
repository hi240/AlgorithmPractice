package Programmers1;

import java.util.Arrays;

//���� ������������ ��ġ�ϱ�
public class IntegerDescending {
	public static void main(String[] args) {
		
		long n=118372;
		String st = String.valueOf(n);
		char[] ch = st.toCharArray();
		Arrays.sort(ch);
		StringBuffer sb = new StringBuffer();
		sb.append(String.valueOf(ch));
		System.out.println(sb.reverse().toString());
		
	}
}
