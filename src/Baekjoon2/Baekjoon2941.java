package Baekjoon2;

import java.util.*;
import java.io.IOException;

public class Baekjoon2941{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int num=0;
        if(word.contains('c=')){
            while(word.contains('c=')){
              num++;
              word.replaceFirst('c=','');  
            }
        }
        if(word.contains('c-')){
            while(word.contains('c-')){
              num++;
              word.replaceFirst('c-','');  
            }
        }
        if(word.contains('dz=')){
            while(word.contains('dz=')){
              num++;
              word.replaceFirst('dz=','');  
            }
        }
        if(word.contains('d-')){
            while(word.contains('d-')){
              num++;
              word.replaceFirst('d-','');  
            }
        }
        if(word.contains('lj')){
            while(word.contains('lj')){
              num++;
              word.replaceFirst('lj','');  
            }
        }
        if(word.contains('nj')){
            while(word.contains('nj')){
              num++;
              word.replaceFirst('nj','');  
            }
        }
        if(word.contains('s=')){
            while(word.contains('s=')){
              num++;
              word.replaceFirst('s=','');  
            }
        }
        if(word.contains('z=')){
            while(word.contains('z=')){
              num++;
              word.replaceFirst('z=','');  
            }
        }
        num += word.length;
        System.out.println(num);
    }
}