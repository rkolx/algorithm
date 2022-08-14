package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1074 {

    static int N, R, C, count;
    static void zCount(int size, int r, int c) {

        if (size == 1 ) {
            System.out.println(count);
        }

        int n = size / 2;
        if (r < n && c < n) {
            count += n * n * 0;
            zCount(n, r, c);
        } else if (r < n && c < n + n) {
            count += n * n * 1;
            zCount(n, r, c - n);
        } else if (r < n + n && c < n) {
            count += n * n * 2;
            zCount(n, r - n, c);
        } else if (r < n + n && c < n + n) {
            count += n * n * 3;
            zCount(n, r - n, c - n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        zCount((int) Math.pow(2, N), R, C);
    }
}
