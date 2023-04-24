package inflearn.section02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02_04 {
    public static void main(String[] args) throws IOException {
        Main02_04 m = new Main02_04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int n : m.Solution(N)) {
            System.out.print(n + " ");
        }

    }

    public int[] Solution(int N) {
        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }

    public void Solution2(int N) {
        int a = 1, b = 1, c;
        System.out.println(a + " " + b + " ");
        for (int i = 2; i < N; i++) {
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }
}
