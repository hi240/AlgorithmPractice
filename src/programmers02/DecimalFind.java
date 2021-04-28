package programmers02;

import java.util.HashSet;

//소수 찾기
public class DecimalFind {
	public static void main(String[] args) {
		String numbers="011";
		HashSet<Integer> set = new HashSet<>();
		permutation("",numbers,set);
		int count=0;
		while(set.iterator().hasNext()) {
			int a=set.iterator().next();
			count +=decimal(a);
			set.remove(a);
		}
		System.out.println(count);
	}
	//중복 순열
	public static void permutation(String prefix,String str,HashSet<Integer> set) {
		int n = str.length();
		if(!prefix.equals("")) {
			set.add(Integer.valueOf(prefix));
		}
		for(int i=0;i<n;i++) {
			permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n),set);
		}
	}
	//소수 검증
	public static int decimal(int num) {
		if(num==1||num==0) return 0;
		if(num==2||num==3) return 1;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return 0;
			}
		}
		return 1;
	}
}
