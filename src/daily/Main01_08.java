package daily;

import java.util.Arrays;
import java.util.Scanner;

public class Main01_08 {

    public String Solution(String s){

        String answer = "YES";

        char[] ch = s.toLowerCase().toCharArray();
        String tmp = "";
        for (char x : ch) {
            if (Character.isAlphabetic(x) || Character.isDigit(x)){
                tmp += x;
            }
        }
        char[] result = tmp.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] != result[result.length-i-1]){
                return "NO";
            }
        }

        return answer;
    }


    public static void main(String[] args){
        Main01_08 m = new Main01_08();

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        System.out.println(m.Solution(input));
    }
}