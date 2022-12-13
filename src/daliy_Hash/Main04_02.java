package daliy_Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main04_02 {

    public static void main(String[] args) throws IOException {
        Main04_02 m = new Main04_02();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String f = br.readLine();
        String s = br.readLine();

        System.out.print(m.Solution(f, s));

    }

    public String Solution(String f, String s) {

        Map<Character, Integer> firstMap = new TreeMap<>();
        Map<Character, Integer> secondMap = new TreeMap<>();
        for (int i = 0; i < f.length(); i++) {
            firstMap.put(f.charAt(i), firstMap.getOrDefault(f.charAt(i), 0) + 1);
            secondMap.put(s.charAt(i), secondMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        String answer = "";
        for (Character c : firstMap.keySet()) {
            if (firstMap.get(c) == secondMap.get(c)) {
                answer = "YES";
            } else {
                answer = "NO";
                break;
            }
        }
        return answer;
    }
}
