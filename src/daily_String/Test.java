package daily_String;

import java.util.Scanner;

public class Test {
    public char[] Solution(String s){

        char[] answer = new char[s.length()];

        int f = 0;
        int l = s.length()-1;
        for (int i = 0; i < s.length(); i++) {

        }

        return answer;
    }

    public static void main(String[] args){

        Main01_05 m = new Main01_05();

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for (char x:m.Solution(s)) {
            System.out.print(x);
        }
    }
}
