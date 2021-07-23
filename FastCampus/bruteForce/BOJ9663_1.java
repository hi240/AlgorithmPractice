import java.util.Arrays;
import java.util.Scanner;

public class BOJ9663_1 {
    public static int N,sum;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        dfs(0);
        System.out.println(sum);
    }
    public static void dfs(int depth){
        if(depth==N){
            sum++;
        }else{
            for(int i=0;i<N;i++){
                boolean chk=true;
                arr[depth]=i;
                for(int j=0;j<depth;j++) {
                    if (!check(depth, arr[depth],j,arr[j])){
                        chk=false;
                        break;
                    }
                }
                if(chk){
                    dfs(depth+1);
                }
                arr[depth]=0;
            }
        }
    }
    public static boolean check(int n1,int n2,int m1,int m2){
        if(n2==m2) return false;
        if(n2-n1==m2-m1) return false;
        if(n1+n2==m1+m2) return false;
        return true;
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        sc.close();
    }
}
