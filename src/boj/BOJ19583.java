package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ19583 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        String E = st.nextToken();
        String Q = st.nextToken();

        Set<String> start = new HashSet<>();
        Set<String> end = new HashSet<>();
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("")) {
                break;
            }
            String[] str = s.split(" ");
            if (S.compareTo(str[0]) >= 0) {
                start.add(str[1]);
            } else if (E.compareTo(str[0]) <= 0 && Q.compareTo(str[0]) >= 0) {
                end.add(str[1]);
            }
        }

        int count = 0;

        for (String s : end) {
            if (start.contains(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
