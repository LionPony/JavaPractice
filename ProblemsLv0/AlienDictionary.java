//https://school.programmers.co.kr/learn/courses/30/lessons/120869
package ProblemsLv0;

import java.util.HashSet;

public class AlienDictionary {
    //Find the word can be made by spell in dic.
    public int alienDictionary(String[] spell, String[] dic){
        HashSet<String> spellSet = new HashSet<>();
        for(String i : spell){
            spellSet.add(i);
        }

        HashSet<String> dicSet;
        for(String i : dic){
            dicSet = new HashSet<>();
            for(int j = 0; j < i.length(); j++){
                dicSet.add(String.valueOf(i.charAt(j)));
            }
            if(spellSet.equals(dicSet)){
                return 1;
            }
        }

        return 2;
    }
}
