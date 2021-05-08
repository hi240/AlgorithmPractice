package kakao;

public class First {
	public static void main(String[] args) {
		String s = "zero1onetwo3";
		char[] ch = s.toCharArray();
		StringBuffer sb =new StringBuffer();
		StringBuffer word =new StringBuffer();
        for(int i=0;i<s.length();i++){
        	if(ch[i]>=97&&ch[i]<=122) { //¾ËÆÄºªÀÓ
        		sb.append(ch[i]);
        	}else {
        		word.append(ch[i]);
        	}
        	if(sb.length()>=3) {
        		String a=String.valueOf(sb);
        		if(a.equals("zero")) {
        			word.append("0");
        			sb.delete(0, sb.length());
        		}else if(a.equals("one")) {
        			word.append("1");
        			sb.delete(0, sb.length());
        		}else if(a.equals("two")) {
        			word.append("2");
        			sb.delete(0, sb.length());
        		}else if(a.equals("three")) {
        			word.append("3");
        			sb.delete(0, sb.length());
        		}else if(a.equals("four")) {
        			word.append("4");
        			sb.delete(0, sb.length());
        		}else if(a.equals("five")) {
        			word.append("5");
        			sb.delete(0, sb.length());
        		}else if(a.equals("six")) {
        			word.append("6");
        			sb.delete(0, sb.length());
        		}else if(a.equals("seven")) {
        			word.append("7");
        			sb.delete(0, sb.length());
        		}else if(a.equals("eight")) {
        			word.append("8");
        			sb.delete(0, sb.length());
        		}else if(a.equals("nine")) {
        			word.append("9");
        			sb.delete(0, sb.length());
        		}
        	}
        }
        System.out.println(word);
	}
}
