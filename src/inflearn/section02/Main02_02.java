package inflearn.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02_02 {
    public static void main(String[] args) throws IOException {

        Main02_02 m = new Main02_02();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.Solution(num, N));
    }

    public int Solution(int[] num, int n) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < num[i]) {
                max = num[i];
                count++;
            }
        }
        return count;
    }
}
