package programmers02;

import java.util.StringTokenizer;
//ÃÖ´ñ°ª°ú ÃÖ¼Ú°ª
public class Max_Min {
	public static void main(String[] args) {
		String s ="1 2 3 4";
	    StringTokenizer st = new StringTokenizer(s," ");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(st.hasMoreTokens()){
            if(max<Integer.parseInt(st.nextToken())){
                max=Integer.parseInt(st.nextToken());
            }
            if(min>Integer.parseInt(st.nextToken())){
                min=Integer.parseInt(st.nextToken());
            }
        }
        String answer = String.valueOf(min)+" "+String.valueOf(max);
        System.out.println(answer);
	}
}
