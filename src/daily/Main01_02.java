package daily;

import java.util.Scanner;

public class Main01_02 {

    public String Solution(String s){

        StringBuilder answer= new StringBuilder();
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isUpperCase(c)){
                answer.append(Character.toLowerCase(c));
            }else if (Character.isLowerCase(c)){
                answer.append(Character.toUpperCase(c));
            }
        }


/*        for (char x:s.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }*/
        
        return answer.toString();
    }


    public static void main(String[] args) {

        Main01_02 m = new Main01_02();

        Scanner in = new Scanner(System.in);
        String input = in.next();

        System.out.println(m.Solution(input));
    }
}