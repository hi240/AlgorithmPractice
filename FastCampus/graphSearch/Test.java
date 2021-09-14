package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[][] test= new int[2][2];
        func(test,0);
        func(test,1);
    }
    public static void func(int[][] temp,int n){
        temp[n][n]=1;
        for(int j=0;j<2;j++) {
            for (int i = 0; i < 2; i++) {
                System.out.print(temp[j][i]);
            }
            System.out.println();
        }
    }
//    public static void func1(String st,int i){
//        if(i==0) st="z";
//        System.out.println(st);
//    }

//    public static void dfs(StringBuffer sb,int depth){
//        if(depth==2) {
//            System.out.println(sb);
//            return;
//        }
//        for(int i=0;i<4;i++){
//            int temp= 0+i;
//            System.out.println(i+" 시작");
//            dfs(sb.append(temp),depth+1);
//            System.out.println(i+" 끝");
//        }
//    }


}
