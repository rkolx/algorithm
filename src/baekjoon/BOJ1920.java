package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = a.length-1;

            boolean answer = false;

            while (left <= right) {
                int midInx = (right + left) / 2;
                int midValue = a[midInx];
                if (midValue > num) {
                    right = midInx -1;
                } else if (midValue < num) {
                    left = midInx + 1;
                } else {
                    answer = true;
                    System.out.println(1);
                    break;
                }
            }
            if (!answer) {
                System.out.println(0);
            }
        }


    }
}
