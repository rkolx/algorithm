package baekjoon;

import java.util.*;

public class BOJ4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            Stack stack = new Stack<>();
            String str = sc.nextLine();

            if (str.charAt(0) == '.') {
                break;
            }
            char[] list = str.toCharArray();
            for (int i = 0; i < list.length; i++) {
                if (list[i] == '(' || list[i] == '[') {
                    stack.push(list[i]);
                }
                if (stack.isEmpty() && (list[i] == ')' || list[i] == ']')) {
                    stack.push(list[i]);
                    break;
                }
                if (list[i] == ')' && !stack.isEmpty()) {
                    if (stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        stack.push(list[i]);
                    }
                }
                if (list[i] == ']' && !stack.isEmpty()) {
                    if (stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        stack.push(list[i]);
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
//        Scanner sc = new Scanner(System.in);
//        Stack stack = new Stack<>();
//        while (sc.hasNextLine()) {
//            String[] str = sc.nextLine().split("\n");
//            List<Character> temp = new ArrayList<>();
//            max = str[count].length();
//            for (int i = 0; i < max; i++) {
//                System.out.print(str[count].charAt(i));
//            }
//        }

