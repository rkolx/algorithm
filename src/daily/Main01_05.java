package daily;

import java.util.Scanner;

public class Main01_05 {
    public char[] Solution(String s){

        char[] answer = new char[s.length()];
        int first = 0;
        int last = s.length()-1;

        for (int i = 0; i <answer.length; i++) {
            answer[i] = s.charAt(i);
        }

        while (first < last){
            char tmp = answer[first];
            answer[first] = answer[last];
            answer[last] = tmp;
            first++;
            last--;
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
