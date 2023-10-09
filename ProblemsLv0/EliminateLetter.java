//https://school.programmers.co.kr/learn/courses/30/lessons/120826
package ProblemsLv0;

public class EliminateLetter {
    //Elimiate specific char in String
    public String elimiateSpecificChar(String my_string, String letter){
        String result = "";
        for(int i = 0; i < my_string.length(); i++){
            if(!letter.equals(Character.toString(my_string.charAt(i)))){
                result += my_string.charAt(i);
            }
        }
        return result;
    }
}
