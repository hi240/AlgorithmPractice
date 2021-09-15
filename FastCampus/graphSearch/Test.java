package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int r=1;
        int s=0;
        int what=0;
        what ^=r;
        System.out.println(what);
        what ^=s;
        System.out.println(what);
    }
}