package daliy_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main06_01 {

    public static void main(String[] args) throws IOException {
        Main06_01 m = new Main06_01();
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

        for (int i = 0; i < answer.length - 1; i++) {
            int min = i;
            for (int j =  i + 1; j < answer.length; j++) {
                if (answer[min] > answer[j]) {
                    min = j;
                }
            }
            int tmp = answer[min];
            answer[min] = answer[i];
            answer[i] = tmp;
        }
        return answer;
    }
}
