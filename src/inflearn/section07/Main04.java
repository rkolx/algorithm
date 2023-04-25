package inflearn.section07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {

    static int[] tmp;
    public int DFS(int n) {
        if (tmp[n] > 0) {
            return tmp[n];
        }
        if (n == 1) {
            return tmp[n] = 1;
        } else if (n == 2) {
            return tmp[n] = 1;
        } else {
            return tmp[n] = DFS(n - 1) + DFS(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        Main04 m = new Main04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        tmp = new int[n + 1];
        m.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(tmp[i] + " ");
        }
    }
}
