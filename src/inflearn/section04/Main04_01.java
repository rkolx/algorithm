package inflearn.section04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main04_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] M = br.readLine().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character key : M) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char answer = ' ';
        for (Character key : map.keySet()) {
            if (map.get(key) > max ) {
                max = map. get(key);
                answer = key;
            }
        }
        System.out.println(answer);
    }
}
