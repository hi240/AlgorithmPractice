package programmers02;

import java.util.Arrays;
//구명보트
public class SaveBoat2 {
	public static void main(String[] args) {
		int[] people= {70, 50, 80, 50};
		int limit=100;
		System.out.println(solution(people,limit));
	}
    public static int solution(int[] people, int limit) {
        int answer = 0;
        int min=0;
        Arrays.sort(people);
        for(int max=people.length-1;min<=max;max--) {
        	if(people[max]+people[min]<=limit) min++;
        	answer++;
        }
        return answer;
    }
}
