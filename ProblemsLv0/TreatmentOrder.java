//https://school.programmers.co.kr/learn/courses/30/lessons/120835

package ProblemsLv0;

import DataStructure.DynamicIntArray;

public class TreatmentOrder {
    //Rank emergency
    public int[] rank(int[] emergency){
        DynamicIntArray ranking = new DynamicIntArray(emergency);
        ranking.ascendSort();
        ranking.reverse();

        DynamicIntArray result = new DynamicIntArray();
        for(int i : emergency){
            result.append(ranking.indexOf(i)+1);
        }
        return result.getIntArray();
    }
}
