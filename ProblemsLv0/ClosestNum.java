//https://school.programmers.co.kr/learn/courses/30/lessons/120890
package ProblemsLv0;

import java.util.ArrayList;
import java.util.Comparator;

public class ClosestNum {
    //Find the closest num in array.
    public int findClosest(int[] numbers, int n) {
        //Make diff map.
        int[] diffMap = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            int diff = (int) Math.sqrt(Math.pow(n - numbers[i], 2));
            diffMap[i] = diff;
        }
        //Find smallest value.
        int smallest = diffMap[0];
        for(int i : diffMap){
            if(smallest > i){
                smallest = i;
            }
        }
        //Return smallest value`s key
        ArrayList<Integer> result = new ArrayList();
        for(int i = 0; i < diffMap.length; i++){
            if(diffMap[i] == smallest){
                result.add(numbers[i]);
            }
        }
        //Closest num can be may. Return lower one.
        result.sort(Comparator.naturalOrder());
        return result.get(0);
    }
}
