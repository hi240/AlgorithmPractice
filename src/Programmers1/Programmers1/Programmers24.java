package Programmers1;

import java.io.IOException;
import java.util.Arrays;

public class Programmers24 {
	public static void main(String[] args) throws IOException{
		int[]stages = {1,2,3};
	//	System.out.println(solution(3, stages));
    	        
	}
	
    public static int[] solution(int N, int[] stages) {
    	        int[] answer = {};
    	        double[] fail = {2.3};
    	        int[] arr = new int [fail.length];
    	        for(int i=0;i<fail.length;i++) {
    	        	fail[i] *=1000;
    	        	fail[i]=Math.round(fail[i]);
    	        	arr[i]= Integer.parseInt(String.valueOf(fail[i]));
    	        }
    	        //[125, 420, 500, 500, 0]
//    	        Arrays.sort(arr,new Comparator<Integer>() {
//    	        	@Override
//    	        	public int compare(double a,double b) {
//    	        		return a;
//    	        	}
//    	        });
    	        return answer;
    	        
    	      
    }
}
 




