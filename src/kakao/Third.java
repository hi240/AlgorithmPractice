package kakao;

import java.util.Stack;

public class Third {
	public static void main(String[] args) {
		int n=8;
		int k=2;
		String[] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
	//	String[] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
		boolean[] chk = new boolean[n+1];
		for(int i=0;i<chk.length;i++) {
			chk[i]=true;
		}
		k +=1;
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<cmd.length;i++) {
			char ch =cmd[i].charAt(0);
			if(ch=='U') {
				int num = Integer.parseInt(cmd[i].substring(2));
				k -=num;
				System.out.println("u "+k);
			}else if(ch=='D') {
				int num = Integer.parseInt(cmd[i].substring(2));
				k +=num;
				System.out.println("d "+k);
			}else if(ch=='C') {
				chk[k]=false;
				st.add(k);
				if(k==n) k-=1;
				else k +=1;
				System.out.println("c "+k);
			}else {
				chk[st.pop()]=true;
				System.out.println("z "+k);
			}
		
		}
		for(boolean i:chk) {
			System.out.println(i);
		}
		String answer="";
        for(int i=0;i<chk.length;i++){
            if(chk[i]==true){
                answer.concat("O");
            }else{
                answer.concat("X");
            }
        }
        System.out.println(answer);
	}
}
