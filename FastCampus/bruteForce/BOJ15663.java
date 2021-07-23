package bruteForce;

import java.util.Arrays;
import java.util.Scanner;
//n°úm(9)
public class BOJ15663 {
    public static int N,M;
    public static int[] arr,num,used;
    public static boolean[] check;
    public static void main(String[] args) {
        input();
        dfs(0);
    }
    public static void dfs(int depth){
        if(depth==M){
            for(int i=0;i<M;i++){
                System.out.print(num[i]+" ");
            }
            System.out.println();
        }else {
            int lastIndex=0;
            for(int i=0;i<N;i++){
                if(used[i]==1) continue;
                if(lastIndex==arr[i]) continue;
                num[depth]=arr[i]; used[i]=1;
                lastIndex=num[depth];
                dfs(depth+1);
                num[depth]=0; used[i]=0;
            }
        }
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        num = new int[M];
        used = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        sc.close();
    }
}
