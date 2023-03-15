package daliy_StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main05_07 {

    public static void main(String[] args) throws IOException {
        Main05_07 m = new Main05_07();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String n = br.readLine();

        System.out.println(m.Solution(a, n));
    }

    public String Solution(String a, String n) {
        String answer = "NO";
        String str = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < n.length(); j++) {
                if (a.charAt(i) == n.charAt(j)) {
                    stack.push(n.charAt(j));
                }
            }
        }
        for (Character c : stack) {
            str += c;
        }

        if (str.equals(a)) {
            answer = "YES";
            return answer;
        }
        return answer;
    }

    public String Solution1(String a, String n) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (Character c : a.toCharArray()) {
            queue.offer(c);
        }
        for (Character c : n.toCharArray()) {
            if (queue.contains(c)) {
                if (c != queue.poll()) {
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }
}
