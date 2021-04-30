package programmers02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//����ä�ù�
public class OpenChattingRoom {
	public static void main(String[] args) {
	}
}
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> arr = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<record.length;i++){
            String[] str=record[i].split(" ");
            if(str[0].equals("Enter")){
                map.put(str[1],str[2]);
                arr.add(str[1]+"���� ���Խ��ϴ�.");
            }else if(str[0].equals("Leave")){
                arr.add(str[1]+"���� �������ϴ�.");
            }else{
                map.put(str[1],str[2]);
            }
        }
        String[] answer= new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            String st =arr.get(i);
            String temp=st.substring(0,st.indexOf("��"));
            answer[i]=map.get(temp)+st.substring(st.indexOf("��"));
        }
        return answer;
    }
}