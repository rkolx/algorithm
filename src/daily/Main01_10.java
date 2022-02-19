package daily;

import java.util.Scanner;

public class Main01_10 {
    public int[] Solution(String s, char c){
        int[] answer = new int[s.length()];

        int p = 1000;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == c) {
                p = 0;
                answer[i] = p;
             }else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                p = 0;
            }else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }


    public static void main(String[] args){

        Main01_10 m = new Main01_10();

        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch = in.next().charAt(0);

        for (int x:m.Solution(s, ch)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}