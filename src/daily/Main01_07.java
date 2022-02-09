package daily;

import java.util.Scanner;

public class Main01_07 {

    public String Solution(String s){
        String answer = "YES";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return "NO";
            }
        }
        return answer;
    }


    public static void main(String[] args){
        Main01_07 m = new Main01_07();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(m.Solution(input));
    }
}
