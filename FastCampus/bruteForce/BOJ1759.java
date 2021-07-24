package bruteForce;

import java.util.Arrays;
import java.util.Scanner;
//암호 만들기
public class BOJ1759 {
    public static int L,C;
    public static String[] arr;
    public static void main(String[] args) {
        input();
        dfs(0,"");
    }
    public static void dfs(int depth,String str){
        if(depth==L){
            if(!check(str)) return;
            System.out.println(str);
        }else{
            for(int i=depth;i<C;i++){
                if(!str.isEmpty()){
                    if(str.charAt(str.length()-1)>=arr[i].charAt(0)){
                        continue;
                    }
                }
                dfs(depth+1,str+arr[i]);
            }
        }
    }
    public static boolean check(String str){ //
        int vowel=0;
        int consonent=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else{
                consonent++;
            }
        }
        if(vowel>0&&consonent>1) return true;
        return false;
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();
        arr = new String[C];
        for(int i=0;i<C;i++){
            arr[i]=sc.next();
        }
        Arrays.sort(arr);
        sc.close();
    }
}
