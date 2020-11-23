package Baekjoon2;

import java.util.*;
import java.io.IOException;

public class Baekjoon2941{

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        int num=0;
        word=contain(word,"c=");
        word=contain(word,"c-");
        word=contain(word,"dz=");
        word=contain(word,"d-");
        word=contain(word,"lj");
        word=contain(word,"nj");
        word=contain(word,"s=");
        word=contain(word,"z=");
        num += word.length();
        System.out.println(num);
    }
    public static String contain (String word,String a) {
		if(word.contains(a)) {
	        	word=word.replaceAll(a," ");
		}
		return word;
	}
}

