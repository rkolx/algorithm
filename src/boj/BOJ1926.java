package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BOJ1926 {

    static int n, m, cnt, max;
    static int[][] arr;
    static boolean[][] visit;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {0, 1, 0, -1};

    public static void BFS(int i, int j) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i, j));
        int count = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            count++;
            for (int k = 0; k < 4; k++) {
                int nx = node.x + dx[k];
                int ny = node.y + dx[k];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                if (visit[nx][ny] || arr[nx][ny] == 0) continue;
                visit[nx][ny] = true;
                queue.add(new Node(nx, ny));
            }
        }
        cnt++;
        if (count > 1) {
            count--;
        }
        max = Math.max(max, count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(st.nextToken());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && !visit[i][j]) {
                    BFS(i, j);
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

}
