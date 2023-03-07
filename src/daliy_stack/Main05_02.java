package daliy_stack;

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
        System.out.println(stack);
        return answer;
    }
}
