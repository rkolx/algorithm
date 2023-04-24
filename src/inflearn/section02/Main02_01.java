package inflearn.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main02_01 {

    public int Solution(int n, int[] nums){
        String answer = "";
        for (int i = 0; i < nums.length - 1; i++) {
            if (i==0){
                answer += nums[0];
                System.out.print(nums[0]);
            }
            if (nums[i] < nums[i+1]){
                answer += nums[i+1];
                System.out.print(" "+nums[i+1]);
            }
        }
        return Integer.parseInt(answer);
    }

    public ArrayList<Integer> Solution2 (int n, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i-1]){
                answer.add(nums[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02_01 m = new Main02_01();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numList = new int[n];

        for (int i = 0; i < n; i++) {
            numList[i] = in.nextInt();
        }

/*        for (int x:m.Solution2(n,numList)) {
            System.out.print(x+" ");
        }*/

        m.Solution(n,numList);
    }


}
