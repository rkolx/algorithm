package daily;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01_04 {

    public ArrayList<String> Solution(int num, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for (String x: str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){

        Main01_04 m = new Main01_04();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] str = new  String[n];

        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }

        for (String x: m.Solution(n, str)) {
            System.out.println(x);
        }

    }

}
