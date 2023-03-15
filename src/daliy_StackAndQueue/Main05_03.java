package daliy_StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main05_03 {

    public static void main(String[] args) throws IOException {
        Main05_03 main = new Main05_03();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n + 1][n + 1];
        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(main.Solution(n, board, moves));
    }

    public int Solution(int n, int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 1; j <= n; j++) {
                if (board[j][move] != 0) {
                    if (!stack.isEmpty() && stack.peek().equals(board[j][move])) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move]);
                    }
                    board[j][move] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
