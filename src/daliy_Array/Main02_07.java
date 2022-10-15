package daliy_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02_07 {

    public static void main(String[] args) throws IOException {
        Main02_07 m = new Main02_07();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(m.Solution(N, arr));
    }

    public int Solution(int N, int[] arr) {
        int count = 0;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                count++;
                answer += count;
            }else {
                count = 0;
            }

        }
        return answer;
    }
}
