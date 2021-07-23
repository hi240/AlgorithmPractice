import java.util.Scanner;
//n과m(2)
public class BOJ15650 {
    static StringBuilder sb = new StringBuilder();
    static int n,m;
    static int[] arr;
    public static void main(String[] args) {
        input();
        recur(1);
        System.out.println(sb.toString());
    }
    public static void recur(int depth){
        if(depth==m+1){
            for(int i=1;i<=m;i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        }else{
            for(int i=arr[depth-1]+1;i<=n;i++){
                arr[depth]=i;
                recur(depth+1);
                arr[depth]=0;
            }
        }
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[m+1];
        sc.close();
    }
}
