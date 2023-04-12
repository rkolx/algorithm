package daliy_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main06_09 {

    public int Count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;

        for (int i : arr) {
            if (sum + i > capacity) {
                cnt++;
                sum = i;
            } else sum += i;
        }
        return cnt;
    }

    public int Solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (Count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main06_09 m = new Main06_09();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(m.Solution(N, M, arr));
    }
}
