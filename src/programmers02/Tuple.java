package programmers02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//Æ©ÇÃ
public class Tuple {
	public static void main(String[] args) {
		String s ="{{20,111},{111}}";
		
		s = s.substring(2,s.length()-2);
        s = s.replace("},{","-");
        String[] str = s.split("-");
	    Arrays.sort(str,new Comparator<String>() {
	    	@Override
	    	public int compare(String o1, String o2) {
	    		return o1.length()-o2.length();
	    	}
		});
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    for(int i=0;i<str.length;i++) {
	    	String[] temp = str[i].split(",");
	    	for(int j=0;j<temp.length;j++) {
	    		if(!arr.contains(Integer.parseInt(temp[j]))) {
	    			arr.add(Integer.parseInt(temp[j]));
	    		}
	    	}
	    }
	    int[] answer = new int[arr.size()];
	    for(int i=0;i<answer.length;i++) {
	    	answer[i]=arr.get(i);
	    }
	    
	}
}
