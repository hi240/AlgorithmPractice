package codeSignal;

public class _03almostIncreasingSequence {
	boolean almostIncreasingSequence(int[] sequence) {
	    int count=0;
	    for(int i=0;i<sequence.length-1;i++){
	        if(sequence[i]>=sequence[i+1]){
	          count++;
	          if(i>0&&i<sequence.length-2&&sequence[i-1]>=sequence[i+1]&&sequence[i+2]<=sequence[i]){
	              return false;
	          }
	        } 
	        if(count>1)return false;
	    }
	    return true;
	}

}
