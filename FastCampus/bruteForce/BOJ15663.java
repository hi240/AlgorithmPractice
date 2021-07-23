package bruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ15663 {
    public static int N,M;
    public static int[] arr;
    public static ArrayList<String> list;
    public static void main(String[] args) {
        input();
        dfs(0,"");
        System.out.println(list.toString());
    }
    public static void dfs(int depth,String sum){
        if(depth==M){
        	for(int i=0;i<list.size();i++) {
        		if(list.get(i).equals(sum)) return;
        	}
        	list.add(sum);
        }else {
            for(int i=0;i<N;i++){
            	if(arr[i]==arr[depth]) continue;
                dfs(depth+1,sum+" "+arr[i]);
            }
        }
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        list = new ArrayList<String>();
        Arrays.sort(arr);
        sc.close();
    }
}

