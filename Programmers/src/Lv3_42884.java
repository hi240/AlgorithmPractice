import java.util.*;

public class Lv3_42884 {
	public static void main(String args[]) throws Exception{
		class Solution {
		    public int solution(int[][] routes) {
		        int answer = 0;
		        Arrays.sort(routes,((int[] a,int[]b)->{
		            if(a[1]==b[1]) return a[0]-b[0];
		            else return a[1]-b[1];
		        } ));
		        int cut=Integer.MIN_VALUE;
		        for(int[] i:routes){
		            if(cut<i[0]){
		                cut = i[1];
		                answer++;
		            }
		        }
		        return answer;
		    }
		}
	}
}
