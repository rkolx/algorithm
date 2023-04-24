package inflearn.section01;

import java.util.Scanner;

public class Main01_06 {

    public String Solution(String s){
        String answer = "";

        for (int i = 0; i <s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }
        return answer;
    }


    public static void main(String[] args){

        Main01_06 m = new Main01_06();

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.Solution(input));
    }
}
