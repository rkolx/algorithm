package inflearn.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02_09 {

    public static void main(String[] args) throws IOException {
        Main02_09 m = new Main02_09();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.Solution(N, arr));
    }

    public int Solution(int N, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int dia = 0, rev = 0;

        for (int i = 0; i < N; i++) {
            int row = 0; int colum = 0;
            for (int j = 0; j < N; j++) {
                row += arr[i][j];
                colum += arr[j][i];
            }
            answer = Math.max(answer, Math.max(row, colum));
            dia += arr[i][i];
            rev += arr[i][N - 1 - i];
        }
        answer = Math.max(answer, Math.max(dia, rev));

        return answer;
    }
}
