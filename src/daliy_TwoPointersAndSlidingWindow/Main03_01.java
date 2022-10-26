package daliy_TwoPointersAndSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main03_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        List<Integer> num = new ArrayList<>();
//        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            num.add(Integer.parseInt(st1.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
//        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            num.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(num);
        for (Integer n : num) {
            System.out.print(n + " ");
        }

//        System.out.println(Solution(N, M, a, b));

    }

    public static List<Integer> Solution(int N, int M, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0; int p2 = 0;
        while (p1 < N && p2 < M) {
            if (p1 < p2 ) {
                answer.add(a[p1++]);
            } else {
                answer.add(b[p2++]);
            }
        }
        while (p1 < N) {
            answer.add(a[p1++]);
        }
        while (p2 < M) {
            answer.add(b[p2++]);
        }
        return answer;
    }

}
