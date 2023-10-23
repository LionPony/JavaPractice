//https://school.programmers.co.kr/learn/courses/30/lessons/120882
package ProblemsLv0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ranking {
    //Ranking average of scores.
    public int[] ranking(int[][] score){
        // Preprocessing.
        // If subjects are same average is meaningless.
        // Double type can make error.
        ArrayList<Integer> sums = new ArrayList<>();
        int[] averages = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            for (int data : score[i]) {
                sum += data;
            }
            if(!sums.contains(sum)){
                sums.add(sum);
            }
            averages[i] = sum;
        }

        // Find the smallest one.
        sums.sort(Comparator.reverseOrder());

        // Ranking
        int[] result = new int[score.length];
        Iterator<Integer> scan = sums.iterator();
        int rank = 1;

        // Exception for duplicated.
        int count = 0;

        while (scan.hasNext()){
            int sum = scan.next();

            for(int i = 0; i < averages.length; i++){
                if(sum == averages[i]){
                    result[i] = rank;
                    count++;
                }
            }
            // Make next rank.
            rank += count;
            count = 0;
        }

        return result;
    }
}
