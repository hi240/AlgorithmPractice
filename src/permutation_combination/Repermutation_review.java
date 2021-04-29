package permutation_combination;

import java.util.TreeSet;

//중복순열 String 복습
public class Repermutation_review {
	public static void main(String[] args) {
		String st = "123";
		TreeSet<String> set = new TreeSet<>();
		Repermutation("",st,set);
		while(set.iterator().hasNext()) {
			String tmp = set.iterator().next();
			System.out.println(tmp);
			set.remove(tmp);
		}
	}
	public static void Repermutation(String prefix,String str,TreeSet<String> set) {
		int n = str.length();
		if(!prefix.equals("")) {
			set.add(prefix);
		}
		for(int i=0;i<n;i++) {
			Repermutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n),set);
		}
	}
}
