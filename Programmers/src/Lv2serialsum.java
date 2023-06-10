import java.util.*;
//연속된 부분 수열의 합
public class Lv2serialsum {
	public static void main(String args[]) throws Exception{
		int[] arr = {2, 2, 2, 2, 2};
		System.out.println(Arrays.toString(solu(arr,6)));
	}
    public static int[] solu(int[] sequence, int k) {
        int[] answer = new int[2];
        int r=0;
        int sum=0;
        int min = Integer.MAX_VALUE;
        for(int l=0;l<sequence.length;l++) {
        	while(r<sequence.length && sum<k) {
        		sum += sequence[r];
        		r++;
        	}
        	System.out.println("l:"+l+" r:"+r+" sum:"+sum);
        	if(sum==k) {
        		if(min>r-l) {
        			min = r-l;
        			answer[0]=l; answer[1]=r-1;
        		}
        	}
        	sum -= sequence[l];
        }
        return answer;
    }
}