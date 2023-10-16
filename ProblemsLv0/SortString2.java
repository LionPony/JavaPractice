//https://school.programmers.co.kr/learn/courses/30/lessons/120911
package ProblemsLv0;

import java.util.Arrays;

public class SortString2 {
    //Turn every character lower case and sort ascending order.
    public String lowerSorted(String my_string){
        my_string = my_string.toLowerCase();

        String[] lowerSorted = my_string.split("");
        Arrays.sort(lowerSorted);

        StringBuilder result = new StringBuilder();
        for(String i : lowerSorted){
            result.append(i);
        }

        return result.toString();
    }
}
