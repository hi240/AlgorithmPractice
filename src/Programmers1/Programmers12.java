package Programmers1;

import java.util.ArrayList;

/*
 * board :
[[0,0,0,0,0]
[0,0,1,0,3]
[0,2,5,0,1]
[4,2,4,4,2]
[3,5,1,3,1]]	moves=[1,5,3,5,1,2,1,4]   answer=4
 */
class Solution {
    public int solution(int[][] board, int[] moves) {
    	
        int answer = 0;
        ArrayList<Integer> temp = new ArrayList<>(); //인형뽑은거 모아두는 package
        for(int i=0;i<moves.length;i++) {
        	int a =moves[i]-1;
        	
        	for(int j=0;j<board.length;j++) {
        		if(board[j][a]!=0) {
        			int b = board[j][a];
        			temp.add(b);
        			board[j][a]=0;
        			break;
        		}
        	}
        	
        }
        for(int i=1;i<temp.size();i++) {
        	if(temp.get(i-1)==temp.get(i)) {
        		temp.remove(i-1);
        		temp.remove(i);
        	}
        }
        answer=temp.size();
        return answer;
    }
}
/*
moves의 index들이 board 배열의 각 인덱스중에서 가장 앞에 있는 애 대로 가져와서 temp 배열에 쌓기시작한다.
*/