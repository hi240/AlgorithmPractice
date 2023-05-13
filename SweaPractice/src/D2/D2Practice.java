package D2;

import java.util.HashSet;
import java.util.TreeSet;

public class D2Practice {
	public static void main(String[] args){

		HashSet<Integer> hash = new HashSet<>();
        hash.add(2);
        hash.add(3);
        hash.add(1);
        hash.add(4);
        
        for(Integer i : hash){
        	System.out.print(i);
        }
        System.out.println();
       
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(17);

        for(Integer i : tree){
        	System.out.print(i);
        }
        System.out.println();
        tree.remove(4);
        for(Integer i : tree){
        	System.out.print(i);
        }
        System.out.println();    
	}
}
