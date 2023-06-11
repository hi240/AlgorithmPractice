
import java.util.*;
public class Lv2_181188 {
	class Solution {
	    public int solution(int[][] targets) {
	        int answer = 0;
	        Arrays.sort(targets, ((int[] a,int[] b)->{
	            return a[1]-b[1];
	        }));
	        int cut = -1;
	        for(int[] t:targets){
	            if(cut<=t[0]){
	                answer++;
	                cut = t[1];
	            }
	        }
	        return answer;
	    }
	}
}
