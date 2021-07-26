package Programmers1;
import java.util.ArrayList;

/*
�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5,// 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5,// 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,// 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.

ex)answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
 */
public class Programmers2 {
    public int[] solution(int[] answers) {
    	
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] count= new int[3];
        
        for(int i=0;i<answers.length;i++) {
  
        	if(answers[i]==one[i%5]) {
        		count[0]++;
        	}
        	if(answers[i]==two[i%8]) {
        		count[1]++;
        	}
        	if(answers[i]==three[i%10]) {
        		count[2]++;
        	}
        	
        }
       ArrayList<Integer> arr = new ArrayList<>();
       
       int big = count[0]; 
       for(int i=0;i<count.length;i++) { 
    	   if(count[i]>big) {
    		   big = count[i]; 
    	   }
       }
       
       for(int i=0;i<count.length;i++) { 
    	   if(big==count[i]) {
    		   arr.add(i);
    	   }
       }
       
       int[] answer = new int[arr.size()];
       
       for(int i=0;i<arr.size();i++) {
    	   answer[i]=arr.get(i)+1;
       }
        
      return answer;
        
        
    }
}
/*
���ƴ��κ�

  
*/