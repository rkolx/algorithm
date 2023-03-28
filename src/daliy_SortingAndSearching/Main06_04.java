package daliy_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main06_04 {

    public static void main(String[] args) throws IOException {
        Main06_04 m = new Main06_04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i : m.Solution(s, arr)) {
            System.out.print(i + " ");
        }
    }

    public List<Integer> Solution(int s, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = arr.length - 1; i > 0; i--) {
            if (map.size() == s) {
                break;
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
         }
        answer.addAll(map.keySet());
        return answer;
    }
}
