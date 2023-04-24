package boj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ11650 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int[][] array = new int[num][2];

        for(int i = 0; i < num; i++) {

            array[i][0] = scan.nextInt();
            array[i][1] = scan.nextInt();
        }
        Arrays.sort(array, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });
        for(int i = 0; i < num; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
        scan.close();
    }
}
