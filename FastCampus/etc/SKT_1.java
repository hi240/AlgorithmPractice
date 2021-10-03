package etc;

import java.io.IOException;
import java.util.HashMap;

//HashMap
/*
중복된 번호가 나오면 몇번만에 중복이 나온건지 가장 최단만에 중복나온 번호가 몇번만에 나온건지 출력
 */
public class SKT_1 {
    public static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        int[] arr={2,1,3,1,4,2,1,3};
        //int[] arr={1,2,3};
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                min=Math.min(min,i-map.get(arr[i]));
            }else{
                map.put(arr[i],i);
            }
        }
        if(min==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(min);
    }
}
