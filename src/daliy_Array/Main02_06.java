package daliy_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main02_06 {

    public static void main(String[] args) throws IOException {
        Main02_06 m = new Main02_06();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            int revers = m.revers(tmp);
            boolean primeNumber = m.isPrimeNumber(revers);

            if (primeNumber) {
                list.add(revers);
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }

    public boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int revers(int num) {
        int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
