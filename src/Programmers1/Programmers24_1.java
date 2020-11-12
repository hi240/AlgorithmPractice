package Programmers1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
//실패율
public class Programmers24_1 {
	public static void main(String[] args) throws IOException{
		int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(solution(5,arr));
	}
    public static int[] solution(int N, int[] stages) {

    	HashMap<Integer,Double> map = new HashMap<>(); 
        int total= 0;
        int temp= 1;
        while(temp<=N){ //1,2,3,4,5
            for(int i=0;i<stages.length;i++){
                if(stages[i]>=temp){ //스테이지를 다 통과한 애들
                    total++;
                }
            }
            int num=0;
            for(int i=0;i<stages.length;i++){
               if(stages[i]==temp){ //스테이지에 딱 걸친 애들
                   num++;
               }
            }
            if(num==0){ //스테이지에 걸친 애가 없을 경우 0
                map.put(temp, 0.0);
            }else{ //스테이지에 걸친 애 수에 맞는 실패율 구하기
            	map.put(temp,(double)num/(double)total);
            }
            temp++;
            total=0;
        }
        Integer[] keyarr = map.keySet().toArray(new Integer[map.size()]); //key만 따로 담은 array만들기
 
		Arrays.sort(keyarr,new Comparator<Integer>() {
			@Override
			public int compare(Integer a,Integer b) {
				return map.get(b).compareTo(map.get(a));
			}
		});
		int[] answer = new int [keyarr.length];
	    for(int i=0;i<keyarr.length;i++) {
	    	answer[i]=keyarr[i];
	    }
		
       return answer;
        
    }
}

