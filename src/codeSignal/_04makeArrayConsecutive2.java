package codeSignal;

import java.util.Arrays;

public class _04makeArrayConsecutive2 {
	int makeArrayConsecutive2(int[] statues) {
	    int add=0;
	    Arrays.sort(statues);
	    for(int i=0;i<statues.length-1;i++){
	        if(statues[i]+1==statues[i+1]){
	            continue;
	        }else{
	            int a =statues[i+1]-statues[i]-1;
	            add +=a;
	        }
	    }
	    return add;
	}
}
