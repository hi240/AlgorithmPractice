package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//이진 검색 트리
public class BOJ5639 {
     static ArrayList<Integer> list;
     static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        input();
        traverse(0,list.size()-1);
        System.out.print(sb.toString());
    }
     static void traverse(int l,int r){
       if(l>r) return; //역순으로 바뀌면 패스
       int mid = r; //기준점 초기값은 r값. (현재값이 l값이기 때문)
       for(int i=l+1;i<=r;i++){ //현재값 다음값부터 현재값보다 큰값이 있는지 찾기
           if(list.get(i)>list.get(l)){ //현재값보다 크다면
               mid=i-1; //기준점 설정
               break;
           }
       }
       //기준점 기준으로 서브트리 나눠서 재귀
       //후위순회
        traverse(l+1,mid); //왼쪽 서브트리
        traverse(mid+1,r); //오른쪽 서브트리
        sb.append(list.get(l)).append('\n'); //루트노드
    }
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list=new ArrayList<>();
        String s;
        while(true){
            s =br.readLine();
            if(s.equals("")||s==null) break;
            list.add(Integer.parseInt(s));
        }
    }
}
