//https://school.programmers.co.kr/learn/courses/30/lessons/120813
package ProblemsLv0;

import DataStructure.DynamicIntArray;

public class HateEven {
    //Make odd array under parameter integer n.
    public int[] makeOddArray(int n) {
        DynamicIntArray dIA = new DynamicIntArray();
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                dIA.append(i);
            }
        }
        return dIA.getIntArray();
    }
}
