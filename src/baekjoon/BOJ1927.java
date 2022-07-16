package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        PriorityQueue priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (!priorityQueue.isEmpty()) {
                    System.out.println(priorityQueue.poll());
                } else {
                    System.out.println(0);
                }
                continue;
            } else {
                priorityQueue.add(n);
            }
        }
    }
}
