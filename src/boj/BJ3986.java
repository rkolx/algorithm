package boj;

import java.util.Scanner;
import java.util.Stack;

public class BJ3986 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < num; i++) {
            String s = sc.next();

            if (s.length()%2 ==1) {
                continue;
            }
            stack.clear();
            for (int j = 0; j < s.length(); j++) {
                if (!stack.isEmpty() && stack.peek() == s.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(j));
                }
            }
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
