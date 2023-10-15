//https://school.programmers.co.kr/learn/courses/30/lessons/120897
package ProblemsLv0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class FindDivisor {
    //Find all divisor.
    public int[] findDivisor(int n){
        Iterator<Integer> scan;

        //Make half of array. It can reduce time complexity.
        ArrayList<Integer> resultHalf = new ArrayList<>();
        int half = (int)Math.sqrt(n);
        for(int i = 1; i <= half; i++){
            if(n%i == 0){
                resultHalf.add(i);
            }
        }

        //Make other half base from resultHalf.
        ArrayList<Integer> resultOther = new ArrayList<>();
        scan = resultHalf.iterator();
        while(scan.hasNext()){
            resultOther.add(n/scan.next());
        }

        //Integrate halfs in one.
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(resultHalf);
        result.addAll(resultOther);

        //Make result order in ascending order.
        result.sort(Comparator.naturalOrder());

        //Exception handle. If half is square root of n. It duplicated.
        if(Math.pow(half, 2) == n){
            result.remove(result.size()/2);
        }

        //Process to make int[].
        int[] resultArray = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
