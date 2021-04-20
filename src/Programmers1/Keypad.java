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
	                case 0: 
	                    if(check(left,11)==check(right,11)){
	                         if(hand.equals("left")){
	                             sb.append("L"); left=numbers[i]; break;
	                        }else{
	                             sb.append("R"); right=numbers[i]; break;
	                        }
	                    }else if(check(left,11)<check(right,11)){
	                        sb.append("L"); left=numbers[i]; break;
	                    }else{
	                        sb.append("R"); right=numbers[i]; break;
	                    }
	            }
	        }
	        String answer=sb.toString();
	        return answer;
	    }
	    public int check(int from,int to){
	        if(from==0) from=11;
	        if(to==0) to=11;
	        int x = (from-1)/3;
	        int y = (from+2)%3;
	        int num_x = to/3;
	        int num_y = (to+2)%3;
	        int distance = Math.abs(num_x-x)+Math.abs(num_y-y);
	        return distance;
	    }
	}
}
