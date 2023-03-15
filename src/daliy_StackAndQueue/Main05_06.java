package daliy_StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main05_06 {

    public static void main(String[] args) throws IOException {
        Main05_06 m = new Main05_06();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        int k = Integer.parseInt(st.nextToken());

        System.out.println(m.Solution(n, k, queue));
    }

    public int Solution1(int n, int k, Queue<Integer> queue) {
        int answer = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < n; i++) {
                if (i % k == 0 && i != 0) {
                    for (int j = 0; j < k; j++) {
                        if (j != k - 1) {
                            queue.offer(queue.peek());
                        }
                        queue.poll();
                        if (queue.size() == 1) {
                            answer = queue.poll();
                        }
                    }
                }
            }
        }
        return answer;
    }

    public int Solution(int n, int k, Queue<Integer> queue) {
        int answer = 0;

        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }
}
