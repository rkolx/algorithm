package baekjoon;

import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int delivery = 0;

        while (true) {
            if (num % 5 == 0 ) {
                System.out.println(num/5 + delivery);
                break;
            } else if (num < 0 ) {
                System.out.println(-1);
                break;
            }
            num -= 3;
            delivery++;
        }
    }
}
