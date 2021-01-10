package Baekjoon2;

import java.util.Scanner;
//∞ÒµÂπŸ»Â¿« √ﬂ√¯
public class Baejoon9020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testnum = sc.nextInt();
        for(int i=0;i<testnum;i++){
            int a= sc.nextInt();
            bach(a);
        }
        sc.close();
    }
    public static void bach(int a){
        int num=0;
        for(int i=2;i<=(a/2);i++){ 
            if(!decimal(i)) continue; 
            if(decimal(i)&&decimal(a-i)) num=i;
        }
        System.out.println(num+" "+(a-num));
    }

    public static boolean decimal(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0) return false;
        }
    return true;

    }

}
