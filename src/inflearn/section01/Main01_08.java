package inflearn.section01;

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

    //정규표현식 이용
    public String Solution2(String s){
        String answer = "NO";
        s = s.toLowerCase().replaceAll("^[A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)){
            return "YES";
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
