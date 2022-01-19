package W3;

import java.util.ArrayList;

public class Programmers42840 {

    public int[] solution2(int[] answers){

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (s1[i % 5] == answers[i]) {
                score[0]++;
            }
            if (s2[i % 8] == answers[i]){
                score[1]++;
            }
            if (s3[i % 10] == answers[i]){
                score[2]++;
            }
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));
        for (int i = 0; i <score.length ; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        ArrayList<Integer> winner = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                winner.add(i+1);
            }
        }

        int[] answer = new int[winner.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = winner.get(i);
        }
        return answer;
    }

}