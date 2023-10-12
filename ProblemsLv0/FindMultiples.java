//https://school.programmers.co.kr/learn/courses/30/lessons/120905
package ProblemsLv0;

import java.util.ArrayList;

public class FindMultiples {
    //Select n`s multiples in array. Remove others.
    public int[] makeMultipleArray(int n, int[] numlist){
        ArrayList<Integer> tempResult = new ArrayList<>();
        for(int i : numlist){
            if(i%n == 0){
                tempResult.add(i);
            }
        }

        int[] result = new int[tempResult.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = tempResult.get(i);
        }
        return result;
    }
}
