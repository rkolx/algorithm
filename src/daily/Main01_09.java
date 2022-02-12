package daily;

import java.util.Scanner;

public class Main01_09 {
    public int Solution(String s){

        String answer = "";
        char[] ch = s.toCharArray();


        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                answer += ch[i];
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

        Main01_09 m = new Main01_09();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(m.Solution(input));
    }
}
