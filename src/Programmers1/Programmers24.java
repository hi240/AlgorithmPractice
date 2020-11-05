package Programmers1;

import java.io.IOException;

public class Programmers24 {
	public static void main(String[] args) throws IOException{
		int[]stages = {1,2,3};
		System.out.println(solution(3, stages));
	}
	
    public static int[] solution(int N, int[] stages) {
    	        int[] answer = {};
    	        double[] fail = {2.3};
    	        Arrays.sort(fail,new Comparator<double>() {
    	        	@Override 
    	        	public int compare(double a,double b) {
    	        		return a;
    	        	}
    	        });
    	        return answer;
    }
}




