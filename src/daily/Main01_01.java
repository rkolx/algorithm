package daily;

import java.util.Scanner;

public class Main01_01 {
    //static하면 객체 필요없죠
    public int Solution(String s, char c){
        int answer = 0;

        s = s.toUpperCase();
        c = Character.toUpperCase(c);

        for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == c) {
               answer++;
           }
        }

        return answer;
    }


    public static void main(String[] args){

        Main01_01 m = new Main01_01();

        Scanner in = new Scanner(System.in);

        String input1 = in.nextLine();
        char input2 = in.next().charAt(0);

        System.out.println(m.Solution(input1, input2));
    }
}