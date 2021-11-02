package etc;

import java.util.HashSet;
//level 2
public class ProgrammersSkillCheck {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int hero=1;
        int turn=1;
        HashSet<String> set = new HashSet<>();
        char prev=words[0].charAt(0);
        for(int i=0;i<words.length;i++){
            if(hero==n+1){
                hero=1; turn++;
            }
            if(set.contains(words[i])){ //이미 말한 단어면
                answer[0]=hero; answer[1]=turn; break;
            }
            if(prev!=words[i].charAt(0)){ //끝말잇기 규칙에 어긋나면
                answer[0]=hero; answer[1]=turn; break;
            }
            set.add(words[i]);
            prev=words[i].charAt(words[i].length()-1);
            hero++;
        }
        return answer;
    }
}
