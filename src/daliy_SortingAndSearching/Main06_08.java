package daliy_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main06_08 {

    public static void main(String[] args) throws IOException {
        Main06_08 m = new Main06_08();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(m.Solution(N, M, list));
    }

    public int Solution(int n, int m, List<Integer> list) {
        int answer = 0;

        Collections.sort(list);
        for (int i = 0; i < n; i++) {
            if (list.get(i).equals(m)) {
                answer = i + 1;
            }
        }
        return answer;
    }
}
