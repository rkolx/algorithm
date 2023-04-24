package inflearn.section04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main04_05 {

    public static void main(String[] args) throws IOException {
        Main04_05 m = new Main04_05();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.Solution(n, k, arr));
    }

    public int Solution(int n, int k, int[] arr) {
        int answer = -1;

        Set<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int s = j + 1; s < n; s++) {
                    tree.add(arr[i] + arr[j] + arr[s]);
                }
            }
        }
        if (k > tree.size()) {
            return answer;
        }

        int count = 1;
        for (Integer i : tree) {
            if (count == k) {
                answer = i;
                 break;
            }
            count++;
        }

        return answer;
    }

}
