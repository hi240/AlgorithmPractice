package sort;

import java.util.Arrays;
import java.util.Scanner;
//국영수
public class BOJ10825 {
    public static int n;
    public static NEW[] arr;
    public static void main(String[] args) {
        input();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        arr= new NEW[n];
        for(int i=0;i<n;i++){
            String name=sc.next();
            int korean=sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();
            arr[i]=new NEW(name,korean,english,math);
        }
    }
    static class NEW implements Comparable<NEW>{
        public String name;
        int korean;
        int english;
        int math;
        public NEW(String name,int korean,int english,int math){
            this.name=name;
            this.english=english;
            this.korean=korean;
            this.math=math;
        }
        public String toString(){
            return name;
        }
        @Override
        public int compareTo(NEW other){
            if(korean!=other.korean) return other.korean-korean;
            else if(english!=other.english) return english- other.english;
            else if(math!= other.math) return other.math-math;
            return name.compareTo(other.name);
        }
    }
}

