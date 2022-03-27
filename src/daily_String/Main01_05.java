package daily_String;

import java.util.Scanner;

public class Main01_05 {
    public char[] Solution(String s){

        //char[] answer = new char[s.length()];
        char[] answer = s.toCharArray();
        int first = 0;
        int last = s.length()-1;

        while (first < last){
             if (!Character.isAlphabetic(answer[first])){
                 first++;
             } else if (!Character.isAlphabetic(answer[last])){
                 last--;
             } else {
                 char tmp = answer[first];
                 answer[first] = answer[last];
                 answer[last] = tmp;
                 first++;
                 last--;
             }
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
