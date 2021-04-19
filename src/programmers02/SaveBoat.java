package programmers02;

//구명보트
public class SaveBoat {
	public static void main(String[] args) {
	}
	public int solution(int[] people, int limit) {
        int count = 0;
        boolean[] check = new boolean[people.length];
        for(int i=0;i<people.length;i++){
            if(check[i]) continue;
            check[i]=true;
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<people.length;j++){
                if(!check[j]){
                    if(people[i]+people[j]<=limit){
                        if(min>limit-(people[i]+people[j])){
                            min=j;
                        }
                    }
                }
            }
            if(min==Integer.MAX_VALUE){
                count++;
                continue;
            }
            count ++;
            check[min]=true;
        }
        return count;
    }
}
