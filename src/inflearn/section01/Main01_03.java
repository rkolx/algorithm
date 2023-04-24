package inflearn.section01;
import java.util.Scanner;

public class Main01_03 {


    public String Solution(String s){

        String[] str = s.split(" ");

        int maxLen = str[0].length();
        int maxIndex = 0;

        for (int i = 0; i <str.length ; i++) {
            if (str[i].length() > maxLen){
                maxLen = str[i].length();
                maxIndex = i;
            }
        }
        return str[maxIndex];
    }

    //split
    public String Solution2(String str){
        String answer = "";

        int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        if (str.length()>m){ // 없으면 그 전의 길이가 긴 단어가 출력
            answer = str;
        }
        return answer;
    }

    //indexOf, substring
    public String Solution3(String str){
        String answer = "";

        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) { // >=하면 뒷쪽에서 같은 길이가 발견되면 갱신되니까 >로 하는것이다
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);

        }

        return answer;
    }

    public static void main(String[] args){

        Main01_03 m = new Main01_03();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.Solution(input));

    }
}


