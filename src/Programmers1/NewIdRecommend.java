package Programmers1;
//�ű� ���̵� ��õ
public class NewIdRecommend {
	public static void main(String[] args) {
		String a = "...!@BaT#*..y.abcdefghijklm";
		System.out.println(solution(a));
	}
    public static String solution(String new_id) {
    	
    	//1.�ҹ��� ġȯ
        new_id=new_id.toLowerCase();
        //2.���ĺ� �ҹ���,����,����,����,��ħǥ �����Ѱ� ��� ���ֱ�
        new_id=new_id.replaceAll("[^a-z0-9-_.]","");
        //3.��ħǥ�� 2�� �̻� �ݺ��Ǹ� �ϳ��� �ٲ۴�.
        new_id=new_id.replaceAll("[.]{2,}",".");
        //4.��ħǥ�� ó���̳� ���� ��ġ�ϸ� ����
        new_id=new_id.replaceAll("^\\.","");
        new_id=new_id.replaceAll("\\.$","");
        //new_id=new_id.replaceAll("^[.]|[.]$","");�� ����.
        //5.�� ���ڿ��̸� a�� ����
        if(new_id.isEmpty()){
            new_id="a";
        }
        //6,7.���̰� 16�� �̻��̸� 15�� ���ķ� �����, 2�����ϸ� �̻����� �����.
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
