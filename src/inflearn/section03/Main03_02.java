package inflearn.section03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main03_02 {

    public static void main(String[] args) throws IOException {
        Main03_02 m = new Main03_02();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr1);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr2);

        for (Integer n : m.Solution(N, arr1, M, arr2)) {
            System.out.print(n + " ");
        }
    }

    public List<Integer> Solution(int N, int[] arr1, int M, int[] arr2) {

        List<Integer> answer = new ArrayList<>();

        int p1 = 0; int p2 = 0;
        while (p1 < N && p2 < M) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }
}
