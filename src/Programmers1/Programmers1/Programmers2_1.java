package Programmers1;

import java.util.ArrayList;

class Programmers2_1 {
    public int[] solution(int[] answers) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        
       for(int i=0;i<answers.length;i++) {
    	   if(num1[i%5]==answers[i]) {
    		   score[0]++;
    	   }
    	   if(num2[i%8]==answers[i]) {
    		   score[1]++;
    	   }
    	   if(num3[i%10]==answers[i]) {
    		   score[2]++;
    	   }
       }	
       
        int max= Math.max(score[0], Math.max(score[1], score[2]));
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<score.length;i++) {
        	if(max==score[i]) {
        		arr.add(i);
        	}
        }
        
        int[] array = new int[arr.size()];
        
        for(int i=0;i<arr.size();i++) {
        	array[i]=arr.get(i)+1;
        }
        
        return array;
    }
}
/*
	answers�迭�� �ε��� ��� for���� ������,
	1,2,3�� �迭��� ������ �ؼ� �״�� �ݺ���Ű�� �ؼ�, �� ��.
*/