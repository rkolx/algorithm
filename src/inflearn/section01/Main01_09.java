package inflearn.section01;

import java.util.Scanner;

public class Main01_09 {
    public int Solution(String s){

        String answer = "";
        char[] ch = s.toCharArray();


        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                answer += ch[i];
            }
        }

/*        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)){
                answer += x;
            }
        }*/

        return Integer.parseInt(answer);
    }

    //아스키코드 이용
    public int Solution2(String s){

        int answer = 0;

        for (char x : s.toCharArray()) {
            if (x >= 49 && x <= 57){
                answer += answer*10+(x-48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main01_09 m = new Main01_09();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(m.Solution(input));
    }
}
