package inflearn.section05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main05_04 {

    public static void main(String[] args) throws IOException {
        Main05_04 m = new Main05_04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.Solution(str));
    }

    public int Solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int num = Character.getNumericValue(str.charAt(i));
                stack.push(num);
            } else {
                int num = 0;
                int first = stack.peek();
                stack.pop();
                int second = stack.pop();
                if (str.charAt(i) == '+') {
                    num = second + first;
                } else if (str.charAt(i) == '-') {
                    num = second - first;
                } else if (str.charAt(i) == '*') {
                    num = second * first;
                } else if (str.charAt(i) == '/') {
                    num = second / first;
                }
                stack.push(num);
            }
        }
        return stack.pop();
    }
}
