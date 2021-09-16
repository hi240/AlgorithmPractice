package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//20210915
//코드업 크레이지 아케이드
public class Codeup_1525 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[][] map; //맵
    public static int[][] player; //플레이어 위치저장
    public static void main(String[] args) throws IOException {
        input();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(map[i][j]>0){ //물풍선 만났을 때
                    func(i,j);
                }
            }
        }
       print();
    }
    public static void func(int x,int y){ //물풍선 터뜨리기
        int size=map[x][y]; //물풍선 길이 저장
        map[x][y]=-2; //해당 위치 물풍선 터진곳이라고 표기
        for(int i=1;i<=size;i++){ //한칸씩 왼쪽으로
            if(y-i<0) break; //맵 범위 넘으면 패스
            if(map[x][y-i]==-1) break; //장애물 만나면 패스
            if(map[x][y-i]>0) func(x,y-i); //다른 물풍선 만나면 그 물풍선 터뜨리기 재귀
            else map[x][y-i]=-2; //아닐시 물풍선 터진곳이라고 표기
        }
        for(int i=1;i<=size;i++){ //한칸씩 오른쪽
            if(y+i>=10) break;
            if(map[x][y+i]==-1) break;
            if(map[x][y+i]>0) func(x,y+i);
            else map[x][y+i]=-2;
        }
        for(int i=1;i<=size;i++){ //한칸씩 위로
            if(x-i<0) break;
            if(map[x-i][y]==-1) break;
            if(map[x-i][y]>0) func(x-i,y);
            else map[x-i][y]=-2;
        }
        for(int i=1;i<=size;i++){ //한칸씩 밑으로
            if(x+i>=10) break;
            if(map[x+i][y]==-1) break;
            if(map[x+i][y]>0) func(x+1,y);
            else map[x+i][y]=-2;
        }
    }
    public static void print(){
        for(int i=0;i<player.length;i++){
            if(map[player[i][0]-1][player[i][1]-1]==0) //player가 있는곳이 빈공간이면
                map[player[i][0]-1][player[i][1]-1]=i+1; //map에 player 위치 표시
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
            if(map[player[i-1][0]-1][player[i-1][1]-1]>0) st="survive"; //player의 위치가 양수면 살아있다고 표시
            System.out.println("player "+i+" "+st);
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
