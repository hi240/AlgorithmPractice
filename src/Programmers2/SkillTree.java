package Programmers2;

import java.io.IOException;
//스킬트리 실패
public class SkillTree {
	public static void main(String[] args) throws IOException{
		String[] a ={"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution("CBD",a));
	}
	
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] charr = skill.toCharArray();
        int count=0;
        for(int i=0;i<skill_trees.length;i++) {
        	int index=0;
        	int j=0;
        	while(j<skill_trees[i].length()) {
        		if(charr[index]==skill_trees[i].charAt(j)) {
        			System.out.println(skill_trees[i]);
        			System.out.println(charr[index]+" "+skill_trees[i].charAt(j));
        			count++;
        			index++;
        		}
        		if(index==skill.length())break;
        		j++;
        	}
        	if(count-1==skill.length()) {
        		answer++;
        	}
        }
        return answer;
    }
	
}
