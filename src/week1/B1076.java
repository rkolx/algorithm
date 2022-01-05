package week1;

import java.util.HashMap;
import java.util.Scanner;

public class B1076 {

    public static void main(String[] args) {

        HashMap<String, String[]> setData= new HashMap<>();
        setData.put("black", new String[]{"0","1"});
        setData.put("brown", new String[]{"1","10"});
        setData.put("red", new String[]{"2","100"});
        setData.put("orange", new String[]{"3","1000"});
        setData.put("yellow", new String[]{"4","10000"});
        setData.put("green", new String[]{"5","100000"});
        setData.put("blue", new String[]{"6","1000000"});
        setData.put("violet", new String[]{"7","10000000"});
        setData.put("grey", new String[]{"8","100000000"});
        setData.put("white", new String[]{"9","1000000000"});

        Scanner sc = new Scanner(System.in);

        String color1 = setData.get(sc.next())[0];
        String color2 = setData.get(sc.next())[0];
        String color3 = setData.get(sc.next())[1];

        long result = Long.parseLong(color1+color2)*Long.parseLong(color3);

        System.out.println(result);

               /* 풀이2
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long ch1 = Arrays.asList(color).indexOf(sc.next())*10;
        long ch2 = Arrays.asList(color).indexOf(sc.next());
        long ch3 = (long) Math.pow(10,Arrays.asList(color).indexOf(sc.next()));
        long result = (ch1+ch2)*ch3;
        System.out.println(result);
        */


    }
}
