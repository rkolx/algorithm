package inflearn.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02_03 {

    public static void main(String[] args) throws IOException {
        Main02_03 m = new Main02_03();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
        }

        for (char c : m.Solution(N, A, B).toCharArray()) {
            System.out.println(c);
        }

    }


    public String Solution(int N, int[] A, int[] B) {

        String answer = "";

        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                answer += 'D';
            } else if (A[i]-B[i] == 1) {
                answer += 'A';
             } else if (A[i]-B[i] == -2) {
                answer += 'A';
            } else if (A[i]-B[i] == -1) {
                answer += 'B';
            } else if (A[i]-B[i] == 2) {
                answer += 'B';
            }
        }
        return answer;
    }
}
