//https://school.programmers.co.kr/learn/courses/30/lessons/120893
package ProblemsLv0;

public class UpperLower {
    public String upperLower(String my_string){
        StringBuilder result = new StringBuilder();
        char letter;

        for(int i = 0; i < my_string.length(); i++){
            letter = my_string.charAt(i);

            if(isUpper(letter)){
                result.append(((char)(letter+32)));
            }
            else {
                result.append((char)(letter-32));
            }
        }

        return result.toString();
    }
    public boolean isUpper(char letter){
        return letter < 97;
    }
}
