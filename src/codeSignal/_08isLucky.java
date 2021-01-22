package codeSignal;

public class _08isLucky {
	boolean isLucky(int n) {
	    String num = String.valueOf(n);
	    String first = num.substring(0,num.length()/2);
	    String second = num.substring(num.length()/2);
	    int firstsum=0;
	    int secondsum=0;
	    System.out.println(first);
	    System.out.println(second);
	    for(int i=0;i<first.length();i++){
	        char[] arr = first.toCharArray();
	        char[] arr2 = second.toCharArray();
	        firstsum +=arr[i]-'0';
	        secondsum +=arr2[i]-'0';
	    }
	    if(firstsum==secondsum) return true;
	    return false;
	}

}
