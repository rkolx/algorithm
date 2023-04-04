package daliy_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main06_06 {

    public static void main(String[] args) throws IOException {
        Main06_06 m = new Main06_06();
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

    public List<Integer> Solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }
}
