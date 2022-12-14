package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14426 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] tmp = new String[N];
        for (int i = 0; i < N; i++) {
            tmp[i] = br.readLine();
        }

        int count = 0;

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            for (String s : tmp) {
                if (s.startsWith(str)) {
                    count++;
                    break;
                }
            }
        }
        System.out.print(count);
    }

}
