package Programmers2;

import java.io.IOException;

/*
H-Index�� �������� ���꼺�� ������� ��Ÿ���� ��ǥ�Դϴ�. ��� �������� H-Index�� ��Ÿ���� ���� h�� ���Ϸ��� �մϴ�. ��Ű���1�� ������, H-Index�� ������ ���� ���մϴ�.

� �����ڰ� ��ǥ�� �� n�� ��,h�� �̻� �ο�� ���� h�� �̻��̰� *(1)����* ������ ���� h�� ���� �ο�Ǿ��ٸ� *(2)����* h�� �ִ��� �� �������� H-Index�Դϴ�.

� �����ڰ� ��ǥ�� ���� �ο� Ƚ���� ���� �迭 citations�� �Ű������� �־��� ��, �� �������� H-Index�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
�����ڰ� ��ǥ�� ���� ���� 1�� �̻� 1,000�� �����Դϴ�.
���� �ο� Ƚ���� 0ȸ �̻� 10,000ȸ �����Դϴ�.

����� ��
	citations	return
[3, 0, 6, 1, 5]		3

����� �� ����
�� �����ڰ� ��ǥ�� ���� ���� 5���̰�, ���� 3���� ���� 3ȸ �̻� �ο�Ǿ����ϴ�. �׸��� ������ 2���� ���� 3ȸ ���� �ο�Ǿ��� ������ �� �������� H-Index�� 3�Դϴ�.
�������,
0ȸ �̻� �ο�Ȱ�= 5 ������ ���� 0ȸ ����? 0
1ȸ �̻� �ο� = 4 ������ ���� 1ȸ �̸�? 1
2ȸ �̻� �ο� = 3 ������ ���� 2ȸ �̸�? 2
3ȸ �̻� = 3 ������ ���� 3ȸ �̸�? 2
4ȸ �̻� = 2 ������ ���� 4ȸ �̸�? 3 
5ȸ �̻� = 2 ������ ���� 5ȸ �̸�? 3


	[20, 19, 18, 1] 3
 */
public class Programmers10 {
	public static void main(String[] args) throws IOException{ 
        int num=0;
        int unnum=0;

        int[] citations = {42,22};
        
        for(int i=0;i<citations.length;i++) { //0 1 2 3
        	int tempnum = num; //num �ο�� �� 
        	int tempunnum = unnum; //unnum �ο�Ȱ��� ������?
        	
        	for(int j=0;j<citations.length;j++) { 
        		if(citations[i]>=j) { //20>=3
        			if(i==citations.length-1&&j==citations.length-1) {
        				tempnum=j+1;
        			}else {
        				tempnum=j; //tempnum= 3
        			}
        		}
        	}
        	
        	tempunnum=citations.length-tempnum; // 4-3 =1 �ο���������༮�� ����
        	
        	if(tempnum<tempunnum) { //�ο�ȼ�< �ο����������
        		break;
        	}else { //�ο�ȼ� > �ο�������� �� 
        		num=tempnum; //num
        		unnum=tempunnum; //unnum
        	}
        	
        }
        System.out.println(num);
	}
}


//[42, 22] answer=2 ;
/*
class Solution {
    public int solution(int[] citations) {
        int num=0; //�ο� ������ 2
        int unnum=0; //�ο� �ȵ� ������ �� ���� 0

        for(int i=0;i<citations.length;i++) { // 1 2
        	
        	int tempnum = num; //2
        	int tempunnum = unnum; //0
        	
        	for(int j=0;j<citations.length;j++) {
        		if(citations[i]>=j) { // 42>=0, 42>=1  , 42>=2
        			tempnum=j; //tempnum=0; tempnum=1; tempnum=2;
        		}
        	}
        	
        	tempunnum=citations.length-tempnum; //tempunnum= 0;
        	
        	if(tempnum<tempunnum) {
        		break;
        	}else {
        		num=tempnum;
        		unnum=tempunnum;
        	}
        	
        }
        
        return num;
    }
}
*/
/*
h���� 0���� n���� ���� ��������.
�̶� �ִ밪���� break;�ؼ� for���� ������ȴ�.

 */