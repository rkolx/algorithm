package daliy_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main06_02 {

    public static void main(String[] args) throws IOException {
        Main06_02 m = new Main06_02();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i : m.Solution(arr)) {
            System.out.print(i + " ");
        }
    }

    public int[] Solution(int[] answer) {
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length - i - 1; j++) {
                if (answer[j] > answer[j + 1]) {
                    int tmp = answer[j + 1];
                    answer[j + 1] = answer [j];
                    answer[j] = tmp;
                }
            }
        }
        return answer;
    }

}
