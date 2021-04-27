package permutation_combination;

import java.util.ArrayList;

//�ߺ� ����
public class Repermutation {
	static ArrayList<String> arr;
	public static void main(String[] args) {
		String str = "112";
		arr = new ArrayList<>();
		permutation("",str);
		for(String a:arr) {
			System.out.println(a);
		}
	}
	public static void permutation(String prefix,String str) {
		int n=str.length();
		if(!prefix.equals("")) {
			arr.add(prefix);
		}
		for(int i=0;i<n;i++) {
			permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
		}
	}
}
