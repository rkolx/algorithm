package daily;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01_12 {
    public String Solution(int n, String str){
        String answer = "";
        int len =  str.length();

        String result = str.replace('*', '0').replace('#','1');

        for (int i = 0; i < len - 1 ; i += 7) {
            String splitList = result.substring(i, i + 7);
            int tmp = Integer.valueOf(splitList, 2);
            char ch = (char)tmp;
            answer +=ch;
        }

        return answer;
    }

    public String Solution2(int n, String str){
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0,7).replace('#','1').replace('*','1');
            int num = Integer.parseInt(tmp,2);
            answer += (char)num;
            //자른 후부터 다시 자르겠끔
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01_12 m = new Main01_12();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        System.out.println(m.Solution(n,str));
    }
}
