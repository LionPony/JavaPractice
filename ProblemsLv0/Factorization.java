//https://school.programmers.co.kr/learn/courses/30/lessons/120852
package ProblemsLv0;

import java.util.ArrayList;
import java.util.Arrays;

public class Factorization {
    public int[] factorization(int n){
        ArrayList<Integer> allFactor = new ArrayList<>();
        while(n > 1){
            for(int i = 2; i <= n; i++){
                if(n%i == 0){
                    allFactor.add(i);
                    n /= i;
                    break;
                }
            }
        }

        ArrayList<Integer> factor = new ArrayList<>();
        for(int i : allFactor){
            if(!factor.contains(i)){
                factor.add(i);
            }
        }

        int[] result = new int[factor.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = factor.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}
