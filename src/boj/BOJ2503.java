package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2503 {

    public static void main(String[] args) throws IOException {
        ArrayList<ArrayList<Integer>> question = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            question.add(new ArrayList<>());

            for (String s1 : s) {
                question.get(i).add(Integer.parseInt(s1));
            }

        }

        int result = 0;

        for (int i = 123; i < 988; i++) {
            int hundreds = i / 100;
            int tens = i / 10 % 10;
            int units = i % 10;


            if (hundreds == tens || hundreds == units || tens == units) continue;


            if (tens == 0 || units == 0) continue;

            boolean flag = true;

            for (ArrayList<Integer> integers : question) {
                int strikeCount = 0, ballCount = 0;

                Integer answer = integers.get(0);
                int hundredsOfAnswer = answer / 100;
                int tensOfAnswer = answer / 10 % 10;
                int unitsOfAnswer = answer % 10;

                Integer strikeAnswer = integers.get(1);
                Integer ballAnswer = integers.get(2);

                if (hundreds == hundredsOfAnswer) strikeCount++;

                if (tens == tensOfAnswer) strikeCount++;
                if (units == unitsOfAnswer) strikeCount++;

                if (hundredsOfAnswer == tens || hundredsOfAnswer == units) ballCount++;

                if (tensOfAnswer == hundreds || tensOfAnswer == units) ballCount++;

                if (unitsOfAnswer == tens || unitsOfAnswer == hundreds) ballCount++;


                if (ballCount != ballAnswer || strikeCount != strikeAnswer) {
                    flag = false;
                    break;
                }

            }

            if (flag) {
                result++;
            }
        }

        System.out.println(result);
    }
}
