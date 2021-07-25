package Programmers2;
/*
124 ������ ����
n	result
1	1
2	2
3	4
4	11
 */

public class Programmers03 {
    public String solution(int n) {
        String answer = "";
        int num=0;
        while(n>3) {
        	n=n/3;
        	num += 4;
        }
        return answer;
    }
}

/*
1/3 1%3 = 0 1 1
2/3 2%3 = 0 2 2
3/3 3%3 = 0 0 4 
4/3, 4%3 = 1 , 1 ,11
5/3, 5%3 = 1 , 2 ,12
6/3, 6%3 = 2 , 0 ,14
7/3, 7%3 = 2 , 1 ,21
8/3, 8%3 = 2 , 2 ,22
9/3, 9%3 = 3 , 0 ,24
10/3, 10%3 = 3 , 1, 41
11/3 11%3 = 3, 2 , 42
12/3 12%3 = 4, 0 , 44
/�� �� ���� ����, %�� 0�� 4�� �ٲ۴�.
*/

