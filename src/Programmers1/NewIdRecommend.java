package Programmers1;
//신규 아이디 추천
public class NewIdRecommend {
	public static void main(String[] args) {
		String a = "...!@BaT#*..y.abcdefghijklm";
		System.out.println(solution(a));
	}
    public static String solution(String new_id) {
    	
    	//1.소문자 치환
        new_id=new_id.toLowerCase();
        //2.알파벳 소문자,숫자,빼기,밑줄,마침표 제외한거 모두 없애기
        new_id=new_id.replaceAll("[^a-z0-9-_.]","");
        //3.마침표가 2번 이상 반복되면 하나로 바꾼다.
        new_id=new_id.replaceAll("[.]{2,}",".");
        //4.마침표가 처음이나 끝에 위치하면 제거
        new_id=new_id.replaceAll("^\\.","");
        new_id=new_id.replaceAll("\\.$","");
        //new_id=new_id.replaceAll("^[.]|[.]$","");도 가능.
        //5.빈 문자열이면 a를 대입
        if(new_id.isEmpty()){
            new_id="a";
        }
        //6,7.길이가 16자 이상이면 15개 이후로 지우고, 2개이하면 이상으로 만든다.
        if(new_id.length()>=16){
            new_id=new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1)=='.'){
                 new_id=new_id.substring(0,new_id.length()-1);
            }
        }else if(new_id.length()<=2){
            while(new_id.length()<3){
                new_id +=new_id.charAt(new_id.length()-1);
            }
        }
        return new_id;
    }
}
