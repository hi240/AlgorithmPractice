package Programmers1;
//소수 만들기
public class Decimal {
	public static void main(String[] args) {
	}
	 public int solution(int[] nums) {
	        int answer = 0;
	        for(int i=0;i<nums.length-2;i++){
	            for(int j=i+1;j<nums.length-1;j++){
	                for(int k=j+1;k<nums.length;k++){
	                    int test = nums[i]+nums[j]+nums[k];
	                    answer +=check(test);
	                }
	            }
	        }
	        return answer;
	    }
	    public int check(int test){
	        for(int i=2;i<=Math.sqrt(test);i++){
	            if(test%i==0)return 0;
	        }
	        return 1;
	    }
}
