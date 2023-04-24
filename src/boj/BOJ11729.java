package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11729 {

    static int count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void hanoi(int n, int x, int y) {
        count ++;
        if (n > 1) {
            hanoi(n-1, x, 6 - x - y);
        }

        sb.append(x + " " + y + "\n");

        if (n > 1) {
            hanoi(n-1, 6 - x - y, y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 3);
        System.out.println(count);
        System.out.println(sb);
    }

}
