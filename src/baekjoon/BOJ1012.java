package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][]ints = new int[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                ints[y][x] = 1;
            }

            int count = 0;

            for (int j = 0; j < N; j++) {
                for (int l = 0; l < M; l++) {
                    if (ints[j][l] == 1) {
                        count++;
                        ints[j][l] = 0;
                        Stack<int[]> stack = new Stack<>();
                        int[] tmp = {j, l};
                        stack.push(tmp);

                        while (!stack.isEmpty()) {
                            int[] pop = stack.pop();
                            int y = pop[0];
                            int x = pop[1];

                            if (y != 0 && ints[y-1][x] == 1){
                                ints[y-1][x] = 0;
                                int[] temp = {y-1, x};
                                stack.push(temp);
                            }
                            if (x != 0 && ints[y][x-1] == 1) {
                                ints[y][x-1] = 0;
                                int[] temp = {y, x-1};
                                stack.push(temp);
                            }
                            if (y != N-1 && ints[y+1][x] == 1) {
                                ints[y+1][x] = 0;
                                int[] temp = {y+1, x};
                                stack.push(temp);
                            }
                            if (x != M-1 && ints[y][x+1] == 1 ) {
                                ints[y][x+1] = 0;
                                int[] temp = {y, x+1};
                                stack.push(temp);
                            }
                        }
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}
