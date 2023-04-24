package inflearn.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02_12 {

    public static void main(String[] args) throws IOException {
        Main02_12 m = new Main02_12();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] ints = new int[M][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                ints[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.Solution(N, M, ints));
    }

    public int Solution(int student, int test, int[][] ints) {
        int answer = 0;
        for (int i = 1; i <= student; i++) {
            for (int j = 1; j <= student; j++) {
                int count = 0;
                for (int k = 0; k < test; k++) {
                    int mentor=0;
                    int mentee = 0;
                    for (int s = 0; s < student; s++) {
                        if (ints[k][s] == i) mentor = s;
                        if (ints[k][s] == j) mentee = s;
                    }
                    if (mentor < mentee) count++;
                }
                if (count == test) answer++;
            }
        }
        return answer;
    }
}
