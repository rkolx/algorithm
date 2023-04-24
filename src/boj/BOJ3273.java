package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ints = new int[n];


        for (int i = 0; i < n; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(ints);
        int start = 0;
        int end = n - 1;
        int count = 0;

        while (start < end) {
            if (ints[start] + ints[end] == x) {
                count++;
                start++;
                end--;
            } else if (ints[start] + ints[end] < x) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);
    }
}
