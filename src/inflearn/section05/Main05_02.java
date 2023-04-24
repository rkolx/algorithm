package inflearn.section05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main05_02 {

    public static void main(String[] args) throws IOException {
        Main05_02 m = new Main05_02();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(m.Solution(s));
//        System.out.println(m.Solution2(s));
    }

    public String Solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                while (stack.pop() != '(') {};
            } else {
                stack.push(s.charAt(i));
            }
        }
        return answer;
    }

    public String Solution2(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }

            if (stack.isEmpty() && c != ')') {
                answer += c;
            }
        }
        return answer;
    }
}
