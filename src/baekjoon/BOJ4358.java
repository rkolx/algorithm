package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class BOJ4358 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        TreeMap<String, Integer> map = new TreeMap<>();
        int total = 0;
        while (true) {
            String str = br.readLine();
            if (str == null || str.equals("")) {
                break;
            }
            map.put(str, map.getOrDefault(str, 0) + 1);
            total++;
        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            double per = (double) (value * 100.0) / total;
            bw.write(key + " " + String.format("%.4f", per) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
