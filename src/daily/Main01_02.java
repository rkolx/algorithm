package daily;

import java.util.Scanner;

public class Main01_02 {

    public String Solution(String s){

        String answer="";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isUpperCase(c)){
                answer += String.valueOf(c).toLowerCase();
            }else if (Character.isLowerCase(c)){
                answer += String.valueOf(c).toUpperCase();
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Main01_02 m = new Main01_02();

        Scanner in = new Scanner(System.in);
        String input = in.next();

        System.out.println(m.Solution(input));
    }
}
