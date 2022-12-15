package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int lt = 0; int rt = 0;
        int sum = 0;
        int count = 0;

        while (lt < N) {
            if (sum > M || rt == N) {
                sum -= arr[lt++];
            } else {
                sum += arr[rt++];
            }
            if (sum == M) {
                count++;
            }
        }
        System.out.println(count);
    }
}
