package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class two {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testnum = sc.nextInt();
        int[] arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        for (int i = 0; i < testnum; i++) {
            int n = sc.nextInt();
            System.out.println(arr[n]);
        }


    }
}
