//https://school.programmers.co.kr/learn/courses/30/lessons/120834
package ProblemsLv0;

import DataStructure.DynamicIntArray;

public class AlienAge {
    //Translate decimal age to alien age
    public String age(int age) {
        DynamicIntArray digit = new DynamicIntArray();
        while(age != 0){
            digit.append(age%10);
            age /= 10;
        }
        String result = "";
        for(int i : digit.getIntArray()){
            result = (char)(i+97)+result;
        }
        return result;
    }
}
