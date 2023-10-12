//https://school.programmers.co.kr/learn/courses/30/lessons/120888
package ProblemsLv0;

import java.util.HashSet;

public class RemoveDuplicate {
    public String removeDuplicate(String my_string){
        HashSet<Character> known = new HashSet<>();
        StringBuilder result = new StringBuilder();
        char letter;
        for(int i = 0; i < my_string.length(); i++){
            letter = my_string.charAt(i);
            if(!known.contains(letter)){
                known.add(letter);
                result.append(letter);
            }
        }
        return result.toString();
    }
}
