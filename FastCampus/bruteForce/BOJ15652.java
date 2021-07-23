import java.util.Scanner;
/*
1 1 1
1 1 2
1 1 3
1 2 2
1 2 3
1 3 3
2 2 2
2 2 3
2 3 3
3 3 3
 */
public class BOJ15652 {
    static StringBuilder sb = new StringBuilder();
    static int n,m;
    static int[] arr;
    public static void main(String[] args) {
        input();
        recur(0,1);
        System.out.println(sb.toString());
    }
    public static void recur(int depth,int num){
        if(depth==m){
            for(int i=0;i<m;i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        }else{
            for(int i=1;i<=n;i++){
               if(i<num)continue;
               arr[depth]=i;
               recur(depth+1,i);
               arr[depth]=0;
            }
        }
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[m];
        sc.close();
    }
}
