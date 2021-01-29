package Programmers2;

import java.io.IOException;
//스킬트리
public class SkillTree_1 {
	public static void main(String[] args) throws IOException{
		String[] skill_trees ={"BACDE", "CBADF", "AECB", "BDA"};
		String skill = "CBD";
		System.out.println(solution(skill,skill_trees));
	}
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0;i<skill_trees.length;i++) {
        	int index=0;
        	int j=0;
        	Loop1: while(j<skill_trees[i].length()) {
        		for(int k=0;k<skill.length();k++) {
        			if(skill_trees[i].charAt(j)==skill.charAt(k)) {
        				if(k==index) {
        					index++;
        				}else {
        					break Loop1;
        				}
        			}
        		}
        		j++;
        		if(j==skill_trees[i].length())answer++;
        	}
        }
        return answer;
    }
}
