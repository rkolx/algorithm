package inflearn.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02_11 {

    public static void main(String[] args) throws IOException {
        Main02_11 main = new Main02_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int[][] ints = new int[s + 1][6];

        for (int i = 1; i <= s; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 6; j++) {
                ints[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(main.Solution(s, ints));
    }

    public int Solution(int n, int[][] ints) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (ints[i][k] == ints[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }
        return answer;
    }
}
