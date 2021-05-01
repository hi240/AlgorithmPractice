package Programmers1;
//로또의 최고 순위와 최저 순위
public class LottoBestAndWorst {
	public static void main(String[] args) {

	}
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        int zero=0;
	        int score=0;
	        for(int i=0;i<lottos.length;i++){
	           if(lottos[i]==0){
	               zero++; continue;
	           }
	            for(int j=0;j<win_nums.length;j++){
	                if(lottos[i]==win_nums[j]){
	                    score++; continue;
	                }
	            }
	        }
	        int min=0;
	        int max=0;
	        switch(score){
	            case 0: max=6; if(zero==0) min=6;
	                else min=max-zero+1;
	                break;
	            case 1: max=6; min=max-zero; break;
	            case 2: max=5; min=max-zero; break;
	            case 3: max=4; min=max-zero; break;
	            case 4: max=3; min=max-zero; break;
	            case 5: max=2; min=max-zero; break;
	            case 6: max=1; min=max-zero; break;
	        }
	        int[] answer= {Math.min(max,min),Math.max(max,min)};
	        return answer;
	    }
	}
}
