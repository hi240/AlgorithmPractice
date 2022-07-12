package Programmers1;

import java.io.IOException;
import java.util.ArrayList;
//제일 작은 수 제거하기
//별표!! ** ** 두번이나 틀리고 겨우풀었다..

public class Programmers20 {
	public static void main(String[] args) throws IOException{
		int[] arr = {10};
		
      int temp=10000000;
      int a=0;
      ArrayList<Integer> array = new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          array.add(arr[i]);
		     if(arr[i]<temp){
		         a=i; //제일 작은 자연수가 잇는 방 을 a로 기록.
		         temp=arr[i];
		     }
      	}
      array.remove(a); //a번쨰 녀석을 제거했어요
      if(array.size()==0){
          array.add(-1);
      }
      int answer[] = new int [array.size()];
      for(int i=0;i<array.size();i++){
          answer[i]=array.get(i);
      }
      System.out.println(answer[0]);
 
	}
}
