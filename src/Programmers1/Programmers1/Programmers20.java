package Programmers1;

import java.io.IOException;
import java.util.ArrayList;
//���� ���� �� �����ϱ�
//��ǥ!! ** ** �ι��̳� Ʋ���� �ܿ�Ǯ����..

public class Programmers20 {
	public static void main(String[] args) throws IOException{
		int[] arr = {10};
		
      int temp=10000000;
      int a=0;
      ArrayList<Integer> array = new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          array.add(arr[i]);
		     if(arr[i]<temp){
		         a=i; //���� ���� �ڿ����� �մ� �� �� a�� ���.
		         temp=arr[i];
		     }
      	}
      array.remove(a); //a���� �༮�� �����߾��
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
