package daily;
import java.util.Scanner;

public class Main01_03 {


    public String Solution(String s){

        String[] str = s.split(" ");

        int maxLen = str[0].length();
        int maxIndex = 0;

        //최대길이가 여러개라면..?
        for (int i = 0; i <str.length ; i++) {
            if (str[i].length() > maxLen){
                maxLen = str[i].length();
                maxIndex = i;
            }
        }

        return str[maxIndex];
    }

    public static void main(String[] args){

        Main01_03 m = new Main01_03();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.Solution(input));

    }
}


