//https://school.programmers.co.kr/learn/courses/30/lessons/120886
package ProblemsLv0;

import java.util.HashMap;

public class MakeAfromB {
    //Check out before can be after. If can return 1 can`t return 0.
    public int makeAfromB(String before, String after){
        HashMap<Character, Integer> elementsOfBefore = new HashMap<>();
        for(int i = 0; i < before.length(); i++){
            char letter = before.charAt(i);
            if(!elementsOfBefore.containsKey(letter)){
                elementsOfBefore.put(letter, 1);
            }
            else{
                elementsOfBefore.put(letter, elementsOfBefore.get(letter)+1);
            }
        }

        HashMap<Character, Integer> elementsOfAfter = new HashMap<>();
        for(int i = 0; i < after.length(); i++){
            char letter = after.charAt(i);
            if(!elementsOfAfter.containsKey(letter)){
                elementsOfAfter.put(letter, 1);
            }
            else{
                elementsOfAfter.put(letter, elementsOfAfter.get(letter)+1);
            }
        }

        if(elementsOfAfter.equals(elementsOfBefore)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
