package Programmers2;

import java.io.IOException;

/*
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중,h번 이상 인용된 논문이 h편 이상이고 *(1)번쨰* 나머지 논문이 h번 이하 인용되었다면 *(2)번쨰* h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.

입출력 예
	citations	return
[3, 0, 6, 1, 5]		3

입출력 예 설명
이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
예를들어,
0회 이상 인용된건= 5 나머지 논문이 0회 이하? 0
1회 이상 인용 = 4 나머지 논문이 1회 미만? 1
2회 이상 인용 = 3 나머지 논문이 2회 미만? 2
3회 이상 = 3 나머지 논문이 3회 미만? 2
4회 이상 = 2 나머지 논문이 4회 미만? 3 
5회 이상 = 2 나저미 논문이 5회 미만? 3


	[20, 19, 18, 1] 3
 */
public class Programmers10 {
	public static void main(String[] args) throws IOException{ 
        int num=0;
        int unnum=0;

        int[] citations = {42,22};
        
        for(int i=0;i<citations.length;i++) { //0 1 2 3
        	int tempnum = num; //num 인용된 수 
        	int tempunnum = unnum; //unnum 인용된거의 나머지?
        	
        	for(int j=0;j<citations.length;j++) { 
        		if(citations[i]>=j) { //20>=3
        			if(i==citations.length-1&&j==citations.length-1) {
        				tempnum=j+1;
        			}else {
        				tempnum=j; //tempnum= 3
        			}
        		}
        	}
        	
        	tempunnum=citations.length-tempnum; // 4-3 =1 인용되지않은녀석의 개수
        	
        	if(tempnum<tempunnum) { //인용된수< 인용되지않은수
        		break;
        	}else { //인용된수 > 인용되지않은 수 
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
        int num=0; //인용 논문개수 2
        int unnum=0; //인용 안된 나머지 논문 개수 0

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
h값은 0부터 n까지 점점 높아진다.
이때 최대값을때 break;해서 for문을 나오면된다.

 */