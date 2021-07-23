import java.util.Scanner;

public class BOJ1182 {
    public static int N,S,num;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        dfs(0,0);
        if(S==0) num--;
        System.out.println(num);
    }
    public static void dfs(int depth,int sum){
        if(depth==N){
            if(sum==S)
            num++;
        }else{
            dfs(depth+1,sum+arr[depth]);
            dfs(depth+1,sum);
        }
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
}
