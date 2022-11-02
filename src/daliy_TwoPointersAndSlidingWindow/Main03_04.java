package daliy_TwoPointersAndSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03_04 {

    public static void main(String[] args) throws IOException {
        Main03_04 m = new Main03_04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(m.Solution(N, M, arr));
    }

    public int Solution(int n, int m, int[] arr) {
        int answer = 0; int sum = 0; int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            if (sum == m) {
                answer++;
            }

            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

}
