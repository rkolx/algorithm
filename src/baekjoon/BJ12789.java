package baekjoon;

import java.util.*;

public class BJ12789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> waiting = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < num; i++) {
            waiting.add(sc.nextInt());
        }

        int start = 1;

        for (int i = 0; i < num; i++) {
            if (waiting.get(i) == start) {
                waiting.remove(i);
                num--;
                i--;
                start++;
            } else if (!temp.isEmpty() && temp.peek() == start) {
                temp.pop();
                start++;
            } else {
                temp.push(waiting.get(i));
            }
        }

        while (!temp.isEmpty()) {
            if (temp.peek() == start) {
                temp.pop();
                start++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");

//        Stack<Integer> finish = new Stack<>();
//
//        for (int i = 0; i < num; i++) {
//            waiting.add(sc.nextInt());
//
//            if (temp.isEmpty() || temp.peek() > waiting.get(i)) {
//                temp.push(waiting.get(i));
//                waiting.remove(i);
//                num--;
//                i--;
//
//            } else {
//                finish.push(temp.pop());
//                if (temp.isEmpty() || temp.peek() > waiting.get(i)) {
//                    temp.push(waiting.get(i));
//                    waiting.remove(i);
//                    num--;
//                    i--;
//                }
//                else {
//                    finish.push(temp.pop());
//                }
//            }
//        }
//
//        int size = waiting.size();
//        int tempSize = temp.size();
//
//        if (waiting.isEmpty()) {
//            for (int i = 0; i < tempSize; i++) {
//                finish.push(temp.pop());
//            }
//        } else {
//            for (int i = 0; i < tempSize; i++) {
//                finish.push(temp.pop());
//            }
//            for (int i = 0; i < size; i++) {
//                finish.push(waiting.get(i));
//                waiting.remove(i);
//                size--;
//                i--;
//            }
//        }
//
//        String answer = "";
//        for (int i = 0; i < finish.size()-1; i++) {
//            if (finish.get(i) - finish.get(i+1) == -1) {
//                answer = "Nice";
//            } else {
//                answer = "Sad";
//                break;
//            }
//        }
//        System.out.println(answer);
    }
}
