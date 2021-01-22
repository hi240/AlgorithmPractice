package codeSignal;

import java.util.ArrayList;

public class _07allLongestStrings {
	String[] allLongestStrings(String[] inputArray) {
	    int length=0;
	    int max=0;
	    for(int i=0;i<inputArray.length;i++){
	       length=inputArray[i].length();
	       if(length>max)max=length;
	    }
	    ArrayList<String> arr = new ArrayList<>();
	    for(int i=0;i<inputArray.length;i++){
	        if(inputArray[i].length()==max)
	         arr.add(inputArray[i]);
	    }
	    String[] str = new String[arr.size()];
	    
	    for(int i=0;i<arr.size();i++) {
	        str[i]=arr.get(i);
	        }
	     return str;
	}

}
