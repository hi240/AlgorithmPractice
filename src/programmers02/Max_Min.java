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
            int a=Integer.parseInt(st.nextToken());
            if(max<a){
                max=a;
            }
            if(min>a){
                min=a;
            }
        }
        String answer = String.valueOf(min)+" "+String.valueOf(max);
        System.out.println(answer);
	}
}
