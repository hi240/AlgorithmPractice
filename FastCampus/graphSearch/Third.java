package graphSearch;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
