package boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ1092 {

    public static void main(String[] args) {
        BJ1092 main = new BJ1092();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(main.solution(sc.next()));
        }
    }

    public String solution(String s) {
        String answer = "NO";
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    left.add(i);
                }
                else right.add(i);
            }

            for (int i = 0; i < s.length()/2; i++) {
                if (left.isEmpty() || right.isEmpty() || left.size() != right.size()) {
                    return answer;
                }
                if (left.get(i) > right.get(i)) {
                   return answer;
                }
            }
            return "YES";
        }
        return answer;
    }
}
