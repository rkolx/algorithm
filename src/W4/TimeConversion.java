package W4;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class TimeConversion_Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String hour = s.substring(0,2);
        char hourChar = s.charAt(8);

        if (hourChar == 'P' && !hour.equals("12")) {
            s = Integer.toString((Integer.parseInt(hour)+12)) + s.substring(2, 8);
        } else {
            s = "12"+s.substring(2, 8);
        }

        if (hourChar == 'A' && !hour.equals("12")) {
            s = hour + s.substring(2, 8);
        } else if (hourChar == 'A'){
            s = "00"+ s.substring(2, 8);
        }
        return s;
    }

}
class TimeConversion_Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversion_Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
