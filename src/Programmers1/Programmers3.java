package Programmers1;
import java.util.Arrays;

/*
�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
array�� ���̴� 1 �̻� 100 �����Դϴ�.
array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
commands�� ���̴� 1 �̻� 50 �����Դϴ�.
commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
*/

class Programmers3 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //answer=[3]������ �迭
        for(int i=0;i<commands.length;i++) { //i=0~i=2����.3��������.
        		int a =commands[i][0]; //a=2
        		int b =commands[i][1]; //b=5;
        		int c =commands[i][2]; //c=3;
        		int[] temp= new int[b-a+1]; //temp[3];
        		for(int j=a;j<=b;j++) { //j=2,3,4,5 �� �ǰ���.
        			temp[j-a]=array[j-1]; //temp[0]=array[1]; temp[1]=array[2],temp[2]=array[3]..�̵ǰ���.
        		}
        	Arrays.sort(temp); //temp=[2,3,5,6]�̵ǰ���.
        	
        	answer[i]=temp[c-1]; //answer[
        }
        return answer;
    }
}
/*
        array                         commands                return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
	2=[0,0] 5=[0,1] 3=[0,2] 4=[1,0] 4=[1,1] 1=[1,2]

1��°temp[5,2,6,3]
����[2,3,5,6]
3��° �� [5]
2��°temp[6]
���� [6]
1��° �� [6]
3��°temp[1,5,2,6,3,7,4]
����[1,2,3,4,5,6,7]
3��° �� [3]
1.  �� ������ ���Ҹ� �̾ƿ��� ���?
	for���� ������ ����
	commands 0��° ���� -1 �� array[]�� �������̵ǰ�, ������
	commands 1��° ���� -1�� array[]�� ������ �ȴ�.
	�ϰ� �ش� �迭�� ���� �Ŀ�,
	commands 2��° ������ �༮�� �ҷ��ͼ� answer�迭�� �ִ´�.
	commands�� ���̸�ŭ(?)commands�� ���� �迭�� ������ŭ, return[]�� ���Ұ� �߰��ȴ�.

*/