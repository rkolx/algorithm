package daliy_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main05_01 {

    public static void main(String[] args) throws IOException {
        Main05_01 m = new Main05_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        System.out.println(m.Solution(n));
    }

    public String Solution(String n) {
        String answer = "NO";
        Stack<Character> stack = new Stack<>();

        if (n.charAt(0) == ')') {
            return answer;
        }
        for (int i = 0; i < n.length(); i++) {
            if (stack.isEmpty() && n.charAt(i) == ')') {
                return answer;
            }
            if (n.charAt(i) == '(') {
                stack.push(n.charAt(i));
            }
            if (!stack.isEmpty() && n.charAt(i) == ')') {
                if (stack.peek().equals('(')) {
                    stack.pop();
                } else {
                    stack.push(n.charAt(i));
                }
            }
        }
        if (stack.isEmpty()) {
            answer = "YES";
        }
        return answer;
    }
}
