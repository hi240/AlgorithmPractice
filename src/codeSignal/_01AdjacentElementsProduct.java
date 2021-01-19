package codeSignal;

public class _01AdjacentElementsProduct {
	int adjacentElementsProduct(int[] inputArray) {
	    int max =inputArray[0]*inputArray[1];
	    for(int i=0;i<inputArray.length-1;i++){
	        int product =inputArray[i]*inputArray[i+1];
	        if(max<product){
	            max=product;
	        }
	    }
	    return max;
	}

}
