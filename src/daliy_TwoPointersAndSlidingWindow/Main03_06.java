package daliy_TwoPointersAndSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03_06 {

    public static void main(String[] args) throws IOException {
        Main03_06 m = new Main03_06();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.Solution(n, k, arr));
    }

    public int Solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = 0;
        int count = k;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                count--;
            }
            while (count < 0) {
                if (arr[lt] == 0) {
                    count++;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt +1);
        }
        return answer;
    }
}
