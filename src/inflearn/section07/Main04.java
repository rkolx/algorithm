package inflearn.section07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {

    public static void main(String[] args) throws IOException {
        Main04 m = new Main04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(m.DFS(i) + " ");
        }
    }

    public int DFS(int n) {
        if (n <= 1) {
            return n;
        } else {
            return DFS(n - 1) + DFS(n - 2);
        }
    }
}
