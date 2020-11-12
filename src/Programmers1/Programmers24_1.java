package Programmers1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
//������
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
                if(stages[i]>=temp){ //���������� �� ����� �ֵ�
                    total++;
                }
            }
            int num=0;
            for(int i=0;i<stages.length;i++){
               if(stages[i]==temp){ //���������� �� ��ģ �ֵ�
                   num++;
               }
            }
            if(num==0){ //���������� ��ģ �ְ� ���� ��� 0
                map.put(temp, 0.0);
            }else{ //���������� ��ģ �� ���� �´� ������ ���ϱ�
            	map.put(temp,(double)num/(double)total);
            }
            temp++;
            total=0;
        }
        Integer[] keyarr = map.keySet().toArray(new Integer[map.size()]); //key�� ���� ���� array�����
 
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

