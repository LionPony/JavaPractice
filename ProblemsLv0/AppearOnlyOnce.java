//https://school.programmers.co.kr/learn/courses/30/lessons/120896
package ProblemsLv0;

import java.util.*;

public class AppearOnlyOnce {
    //Leave only once appeared.
    public String appearOnlyOnce(String s){
        HashMap<Character, Integer> countSight = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(!countSight.containsKey(letter)){
                countSight.put(letter, 1);
            }
            else{
                countSight.put(letter, countSight.get(letter)+1);
            }
        }

        StringBuilder firstSight = new StringBuilder();
        for(char key : countSight.keySet()){
            if(countSight.get(key) == 1){
                firstSight.append(key);
            }
        }

        //Sorting
        String[] sortResult = firstSight.toString().split("");
        Arrays.sort(sortResult);
        firstSight = new StringBuilder();
        for(String i : sortResult){
            firstSight.append(i);
        }

        return firstSight.toString();
    }
}
