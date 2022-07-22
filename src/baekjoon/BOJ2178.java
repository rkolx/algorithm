package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] ints = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                ints[i][j] = line.charAt(j) - '0';
            }
        }

        int[][] tmp = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        int[] v;
        while (!queue.isEmpty()) {
            v = queue.poll();
            for (int d = 0; d < 4; d++) {
                int ni = v[0] + tmp[d][0];
                int nj = v[1] + tmp[d][1];
                if (ni >= 0 && ni < N && nj >= 0 && nj < M && ints[ni][nj] != 0
                        && (ints[ni][nj] > ints[v[0]][v[1]] + 1 || ints[ni][nj] == 1)) {
                    ints[ni][nj] = ints[v[0]][v[1]] + 1;
                    queue.offer(new int[]{ni, nj});
                }
            }
        }
        System.out.println(ints[N - 1][M - 1]);
    }
}