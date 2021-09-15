package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//코드업 크레이지 아케이드
public class Codeup_1525 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[][] map;
    public static int[][] player;
    public static void main(String[] args) throws IOException {
        input();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(map[i][j]>0){
                    func(i,j);
                }
            }
        }
       print();
    }
    public static void print(){
        for(int i=0;i<player.length;i++){
            if(map[player[i][0]-1][player[i][1]-1]==0)
                map[player[i][0]-1][player[i][1]-1]=i+1;
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Character Information");
        for(int i=1;i<=player.length;i++){
            String st="dead";
            if(map[player[i-1][0]-1][player[i-1][1]-1]>0) st="survive";
            System.out.println("player "+i+" "+st);
        }
    }
    public static void func(int x,int y){
        int size=map[x][y];
        map[x][y]=-2;
        for(int i=1;i<=size;i++){ //왼쪽
            if(y-i<0) break;
            if(map[x][y-i]==-1) break;
            if(map[x][y-i]>0) func(x,y-i);
            else map[x][y-i]=-2;
        }
        for(int i=1;i<=size;i++){ //오른쪽
            if(y+i>=10) break;
            if(map[x][y+i]==-1) break;
            if(map[x][y+i]>0) func(x,y+i);
            else map[x][y+i]=-2;
        }
        for(int i=1;i<=size;i++){ //위로
            if(x-i<0) break;
            if(map[x-i][y]==-1) break;
            if(map[x-i][y]>0) func(x-i,y);
            else map[x-i][y]=-2;
        }
        for(int i=1;i<=size;i++){ //밑으로
            if(x+i>=10) break;
            if(map[x+i][y]==-1) break;
            if(map[x+i][y]>0) func(x+1,y);
            else map[x+i][y]=-2;
        }
    }
    public static void input() throws IOException {
        map=new int[10][10];
        for(int i=0;i<10;i++){
            String[] str = br.readLine().split(" ");
            for(int j=0;j<10;j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }
        int num=Integer.parseInt(br.readLine());
        player=new int[num][2];
        for(int i=0;i<num;i++){
            String[] str = br.readLine().split(" ");
            player[i][0]=Integer.parseInt(str[0]);
            player[i][1]=Integer.parseInt(str[1]);
        }
    }
}
