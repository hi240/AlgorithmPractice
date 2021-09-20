package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//20210919
//트리 순회
public class BOJ1991 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static StringBuilder sb = new StringBuilder();
    public static ArrayList<Integer>[] leftchild; //왼쪽 자식노드
    public static ArrayList<Integer>[] rightchild; //오른쪽 자식노드
    public static void main(String[] args) throws IOException {
        input();
        preorder('A');//전위 순회
        sb.append("\n");
        inorder('A');//중위 순회
        sb.append("\n");
        postorder('A');//후위 순회
        System.out.println(sb.toString());
    }
    public static void preorder(int root){
        sb.append((char)root);
        if(!leftchild[root-'A'].isEmpty()){
            preorder(leftchild[root-'A'].get(0)+'A');
        }
        if(!rightchild[root-'A'].isEmpty()){
            preorder(rightchild[root-'A'].get(0)+'A');
        }
    }
    public static void inorder(int dot){
        if(!leftchild[dot-'A'].isEmpty()){
            inorder(leftchild[dot-'A'].get(0)+'A');
        }
        sb.append((char)dot);
        if(!rightchild[dot-'A'].isEmpty()){
            inorder(rightchild[dot-'A'].get(0)+'A');
        }
    }
    public static void postorder(int dot){
        if(!leftchild[dot-'A'].isEmpty()){
            postorder(leftchild[dot-'A'].get(0)+'A');
        }
        if(!rightchild[dot-'A'].isEmpty()){
            postorder(rightchild[dot-'A'].get(0)+'A');
        }
        sb.append((char)dot);
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        leftchild = new ArrayList[N];
        rightchild = new ArrayList[N];
        for(int i=0;i<leftchild.length;i++){
            leftchild[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<rightchild.length;i++){
            rightchild[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<N;i++){
            String[] s = br.readLine().split(" ");
            char mom=s[0].charAt(0);
            char child1=s[1].charAt(0);
            char child2=s[2].charAt(0);
            if(child1!='.') leftchild[mom-'A'].add(child1-'A');
            if(child2!='.') rightchild[mom-'A'].add(child2-'A');
        }
    }
}
