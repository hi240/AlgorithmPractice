package Programmers1;
import java.util.Arrays;

/*
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.
*/

class Programmers3 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //answer=[3]길이의 배열
        for(int i=0;i<commands.length;i++) { //i=0~i=2까지.3바퀴돈다.
        		int a =commands[i][0]; //a=2
        		int b =commands[i][1]; //b=5;
        		int c =commands[i][2]; //c=3;
        		int[] temp= new int[b-a+1]; //temp[3];
        		for(int j=a;j<=b;j++) { //j=2,3,4,5 가 되겠지.
        			temp[j-a]=array[j-1]; //temp[0]=array[1]; temp[1]=array[2],temp[2]=array[3]..이되겠지.
        		}
        	Arrays.sort(temp); //temp=[2,3,5,6]이되겠지.
        	
        	answer[i]=temp[c-1]; //answer[
        }
        return answer;
    }
}
/*
        array                         commands                return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
	2=[0,0] 5=[0,1] 3=[0,2] 4=[1,0] 4=[1,1] 1=[1,2]

1번째temp[5,2,6,3]
정렬[2,3,5,6]
3번째 수 [5]
2번째temp[6]
정렬 [6]
1번째 수 [6]
3번째temp[1,5,2,6,3,7,4]
정렬[1,2,3,4,5,6,7]
3번째 수 [3]
1.  각 범위의 원소를 뽑아오는 방법?
	for문의 범위를 통해
	commands 0번째 원소 -1 이 array[]의 시작점이되고, 끝점은
	commands 1번째 원소 -1이 array[]의 끝점이 된다.
	하고 해당 배열을 정렬 후에,
	commands 2번째 원소의 녀석을 불러와서 answer배열에 넣는다.
	commands의 길이만큼(?)commands가 가진 배열의 갯수만큼, return[]에 원소가 추가된다.

*/