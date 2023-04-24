package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class BOJ20291 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String substring = s.substring(s.lastIndexOf(".") + 1);
            map.put(substring, map.getOrDefault(substring, 0) + 1);
        }
        for (String key : map.keySet()) {
            bw.write(key + " " + map.get(key) +"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
