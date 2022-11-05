package daliy_TwoPointersAndSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03_05 {

    public static void main(String[] args) throws IOException {
        Main03_05 m = new Main03_05();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(m.Solution(N));
    }

    public int Solution(int n) {
        int answer = 0; int sum = 0; int lt = 0;
        int m = n / 2 + 1;
        int[] arr= new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];

            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
