package inflearn.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02_05 {

    public static void main(String[] args) throws IOException {
        Main02_05 m = new Main02_05();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(m.Solution(N));
        }

    public int Solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
     }

}
