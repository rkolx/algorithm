package inflearn.section04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main04_04 {

    public static void main(String[] args) throws IOException {
        Main04_04 m = new Main04_04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            map.put(T.charAt(i), map.getOrDefault(T.charAt(i), 0) + 1);
        }

        System.out.println(m.Solution(S, T, map));
    }


    public int Solution(String s, String t, Map<Character, Integer> map) {
        int answer = 0;
        int count = 0;

        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i <= s.length() - t.length(); i++) {
            String substring = s.substring(i, i + t.length());

            for (int j = 0; j < substring.length(); j++) {
                m.put(substring.charAt(j), m.getOrDefault(substring.charAt(j), 0) + 1);
            }

            for (Character c : m.keySet()) {
                 if (map.containsKey(c) && map.get(c).equals(m.get(c))) {
                     count++;
                 }
            }
            if (count == map.size()) {
                answer++;
            }
            count = 0;
            m = new HashMap<>();
        }
        return answer;
    }
}
