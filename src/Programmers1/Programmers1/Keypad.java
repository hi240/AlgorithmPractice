package Programmers1;
//키패드 누르기
public class Keypad {
	public static void main(String[] args) {
	}
	class Solution {
	    public String solution(int[] numbers, String hand) {
	        int left=10;
	        int right=12;
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<numbers.length;i++){
	            switch(numbers[i]){
	                case 1:
	                case 4:
	                case 7: sb.append("L"); left=numbers[i]; break;
	                case 3:
	                case 6:
	                case 9: sb.append("R"); right=numbers[i]; break;
	                case 2:
	                case 5:
	                case 8:
	                case 0:
	                    int tleft=check(left,numbers[i]);
	                    int tright=check(right,numbers[i]);
	                    if(tleft==tright){
	                        if(hand.equals("left")){
	                             sb.append("L"); left=numbers[i]; break;
	                        }else{
	                             sb.append("R"); right=numbers[i]; break;
	                        }
	                    }else if(tleft<tright){
	                        sb.append("L");
	                        left=numbers[i];
	                        break;
	                    }else {
	                        sb.append("R");
	                        right=numbers[i];
	                        break;
	                    } 
	            }
	        }
	        String answer=sb.toString();
	        return answer;
	    }
	    public int check(int from,int to){
	        from= (from==0)? 11:from;
	        to= (to==0)? 11:to;
	        int x = (from-1)/3;
	        int y = (from+2)%3;
	        int num_x = to/3;
	        int num_y = (to+2)%3;
	        int distance = Math.abs(num_x-x)+Math.abs(num_y-y);
	        return distance;
	    }
	}
}
