package Programmers1;
/*
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.

n	result
10	4  > 2,3,5,7
5	3  > 2,3,5
 */
class Programmers7 {
    public int solution(int n) { //n=5
        int answer = 0;
        for(int i=1;i<n;i++){ //3바퀴돈다.
        	int temp=0;
        	for(int j=1;j<n;j++ ) { //
        		if(i%j==0) { //5%1,5%2,5%3,5%4,5
        			temp++;
        		}
        	}
        	if(temp==2) {
        		answer++;
        	}
        }
        return answer;
    }
}
/*
소수를 구하는 연산식을 먼저 떠올려보자.
소수 3을 구한다 치면,
3/3 만 나머지가 없고, 나머지는ㄷ ㅏ 나머지가있따.?
하지만 숫자 4도,
4/4=0이다.
*/