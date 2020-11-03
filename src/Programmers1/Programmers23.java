package Programmers1;

import java.io.IOException;
//다트게임
public class Programmers23 {
	public static void main(String[] args) throws IOException{
	
		System.out.println(solution("1D2S#10S"));
		
	}
	
	    public static int solution(String dartResult) {
	        String[] dart = dartResult.split("");
	        int[] score = new int [3];
	        int index =0;
	        
	        for(int i=0;i<dart.length;i++){
	            switch(dart[i]){
	            case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "0":
	        	   	if(i>0&&dart[i-1].equals("1")) score[index]=10;
	        	   	else {
	        	   		score[index]=Integer.parseInt(dart[i]);
                    	}
                break;
                case "S":
                    if(index<=3) index++;
                break;
                case "D":
                    score[index]= (int)Math.pow(score[index],2);
                    if(index<=3) index++;
                break;
                case "T":
                    score[index]= (int)Math.pow(score[index],3);
                    if(index<=3) index++;
                break;
                case "*":
                    if(index>1){
                        score[index-1] *=2;
                        score[index-2] *=2;
                    }else if(index==1){
                        score[index-1] *=2;
                    }
                break;
                case "#":
                    score[index-1] *= (-1);
                break;
	        }
	        }
	        int answer=0;
	        for(int i=0;i<score.length;i++){
	            answer += score[i];
	        }
	        return answer;
	    }
	

}
