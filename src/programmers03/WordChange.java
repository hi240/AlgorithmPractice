package programmers03;
//단어 변환
public class WordChange {
	static int answer;
	class Solution {
	    public int solution(String begin, String target, String[] words) {
	        boolean[] visited = new boolean[words.length];
	       dfs(begin,target,words,0,visited);
	        return answer;
	    }
	    public void dfs(String begin,String target,String[] words,int score,boolean[] visited){
	        if(begin.equals(target)){
	            answer=score;
	            return;
	        }
	        for(int i=0;i<words.length;i++){
	            if(!visited[i]&&test(begin,words[i])){
	                visited[i]=true;
	                dfs(words[i],target,words,score+1,visited);
	                visited[i]=false;
	            }
	        }
	    }
	    public boolean test(String begin,String target){ //단어 한글자만 변경하는지 확인
	        char[] ch1=begin.toCharArray();
	        char[] ch2=target.toCharArray();
	        int cnt=0;
	        for(int i=0;i<ch1.length;i++){
	            if(ch1[i]==ch2[i]){
	                cnt++;
	            }
	        }
	        if(cnt==begin.length()-1) return true;
	        return false;
	    }
	}
}
