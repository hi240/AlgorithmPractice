package Programmers1;
//Çà·ÄÀÇ µ¡¼À
public class ProcessionPlus {
	public static void main(String[] args) {
		int[][] arr1= {{1},{2}};
		int[][] arr2= {{1},{2}};
	  int n = arr1.length;
        int m = arr1[1].length;
        int[][] answer = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
	}
}
