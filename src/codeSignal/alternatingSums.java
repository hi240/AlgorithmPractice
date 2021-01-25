package codeSignal;

public class alternatingSums {
	int[] alternatingSums(int[] a) {
	    int[] arr = new int[2];
	    for(int i=0;i<a.length;i++){
	        if(i%2==0)
	        arr[0]+=a[i];
	        else
	        arr[1]+=a[i];
	    }
	return arr;
	}

}
