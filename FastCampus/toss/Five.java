package toss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Five {
    public static void main(String[] args) {
      int a = 3;
      int[] arr={30,40,10,20,30};
        System.out.println(solution(arr,a));
    }
    public static int[] solution(int[] fruitWeights, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<=fruitWeights.length-k;i++){
            int temp=i;
            int max=0;
            while(temp<i+k){
                max=Math.max(max,fruitWeights[temp]);
                temp++;
            }
            set.add(max);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        int[] answer =new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
