package daily_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01_04 {

    //StringBuilder
    public ArrayList<String> Solution(int num, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for (String x: str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }
    //하나하나 뒤집기
    public ArrayList<String> Solution2(int num, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for (String x: str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;

            while (lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
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
