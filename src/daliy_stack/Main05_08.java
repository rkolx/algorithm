package daliy_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main05_08 {

    public static void main(String[] args) throws IOException {
        Main05_08 main = new Main05_08();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(main.Solution(n, m, arr));
    }

    public int Solution(int n, int m, int[] arr) {
        int answer = 1;

        Queue<patient> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new patient(i, arr[i]));
        }

        while (!q.isEmpty()) {
            patient tmp = q.poll();
            for (patient x : q) {
                if (x.risk > tmp.risk) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                if (tmp.id == m) {
                    return answer;
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
}

class patient {

    int id;
    int risk;

    public patient(int idx, int risk) {
        this.id = idx;
        this.risk = risk;
    }
}
