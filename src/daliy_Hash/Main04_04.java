package daliy_Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main04_04 {

    public static void main(String[] args) throws IOException {
        Main04_04 m = new Main04_04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();

        System.out.println(m.Solution(S, T));
    }


    public int Solution(String s, String t) {
        int answer = 0;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        HashMap<Character, Integer> s2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            s2.put(arr2[i], s2.getOrDefault(arr2[i], 0) + 1);
        }

        HashMap<Character, Integer> s1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            s1.put(arr1[i], s1.getOrDefault(arr1[i], 0) + 1);
        }
        if(s1.equals(s2)) answer++;

        for (int i = 0, j = t.length(); j < s.length(); i++, j++) {
            s1.put(arr1[j], s1.getOrDefault(arr1[j], 0) + 1);
            s1.put(arr1[i], s1.get(arr1[i]) - 1);
            if (s1.get(arr1[i]) == 0) s1.remove(arr1[i]);
            if(s1.equals(s2)) answer++;
        }
        return answer;
    }
}
