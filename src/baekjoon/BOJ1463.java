package baekjoon;

import java.util.Scanner;

public class BOJ1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i=2; i<= num; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }
            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }

        System.out.print(dp[num]);
    }
}

//        int count = 0;
//
//        while (num > 1) {
//            System.out.println("while: " + count);
//            if (num % 3 == 0) {
//                num = num / 3;
//                count++;
//            } else if (num % 2 == 0) {
//                num = num / 2;
//                count++;
//            } else {
//                num = num - 1;
//                count++;
//            }
//            System.out.println("num: " + num);
//        }
//        System.out.println(count);
