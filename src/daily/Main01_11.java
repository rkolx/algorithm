package daily;

import java.util.Locale;
import java.util.Scanner;

public class Main01_11 {

    public String Solution(String s){

        String answer = "";
        s = s + " ";
        int count = 1;

        for (int i = 0; i < s.length()-1; i++) {
         if (s.charAt(i) == s.charAt(i+1)){
             count++;
         } else {
             answer += s.charAt(i);
             if (count > 1 ) {
                 answer += String.valueOf(count);
                 count = 1;
             }
         }
        }

        return answer;
    }

    public static void main(String[] args){
        Main01_11 m = new Main01_11();

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.Solution(input));
    }
}