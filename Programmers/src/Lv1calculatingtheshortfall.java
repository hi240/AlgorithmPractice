
import java.util.*;
public class Lv1calculatingtheshortfall {
	    public long solution(int price, int money, int count) {
	        long sum = 0;
	        int cnt = 1;
	        for(int i=0;i<count;i++){
	            sum += func(price, cnt++);
	        }
	        if(money < sum){
	            return sum - money;
	        } else {
	            return 0;
	        }
	    }
	    public static int func(int price, int cnt){
	        return price*cnt ;
	    }
}
