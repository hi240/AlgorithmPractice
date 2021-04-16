package programmers02;
//°ýÈ£ º¯È¯
public class BracketChange {
	public static void main(String[] args) {
		String w=")(";
        System.out.println(whole(w));
	}
	public static String whole(String z) {
		if(z.length()==0) return "";

        int index=splt(z);
        String u=z.substring(0,index);
        String v=z.substring(index);
        
        if(right(u)){
        	return u+whole(v);
        }
        
    	StringBuffer temp= new StringBuffer();
    	temp.append("(");
    	temp.append(whole(v));
    	temp.append(")");
    	u=u.substring(1,u.length()-1);
    	for(int i=0;i<u.length();i++) {
    		if(u.charAt(i)=='(') {
    			temp.append(')');
    		}else {
    			temp.append('(');
    		}
    	}
    	return temp.toString();
	}
    public static int splt(String w){
        int sum=0;
        int index=0;
        for(int i=0;i<w.length();i++){
            index++;
            if(w.charAt(i)=='('){
                sum++;
            }else{
                sum--;
            }
            if(sum==0){
                break;
            }
        }
        return index;
    }
    public static boolean right(String u){
        int sum=0;
        for(int i=0;i<u.length();i++){
            if(u.charAt(i)=='('){
                sum++;
            }else{
                sum--;
            }
            if(sum<0) return false;
        }
        return true;
    }
    
}
