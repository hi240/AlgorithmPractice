package codeSignal;

public class _06commonCharacterCount {
	int commonCharacterCount(String s1, String s2) {
	    char[] ch =s1.toCharArray();
	    char[] ch2= s2.toCharArray();
	    int sum=0;
	    for(int i=0;i<ch.length;i++){
	        for(int j=0;j<ch2.length;j++){
	            if(ch[i]==ch2[j]){
	                sum++;
	                ch2[j]=' ';
	                break;
	            }
	        }
	    }
	    return sum;
	}

}
