package Programmers1;
import java.util.Stack;
//크레인 인형뽑기 게임
public class CraneDollPick {
    public int solution(int[][] board, int[] moves) {
    	
        int count=0;
        Stack<Integer> stk = new Stack<>();   
        
        for(int i=0;i<moves.length;i++){
        	
          int n= getnum(board,moves[i]-1);
          if(n==0) continue;
          if(!stk.isEmpty()&&stk.peek()==n){
              stk.pop();
              count+=2;
              continue;
          }else{
            stk.push(n);
          }
        }
        
        return count;
    }
    public int getnum(int[][] board,int num){
        int n=0;
        for(int x=0;x<board.length;x++){
            if(board[x][num]==0) continue;
            else{
                n=board[x][num];
                board[x][num]=0;
                break;
            }
        }
        return n;
    }
}
