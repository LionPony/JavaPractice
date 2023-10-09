//https://school.programmers.co.kr/learn/courses/30/lessons/120822

package ProblemsLv0;

public class StringReverse {
    //Make String reversed.
    public String reverse(String my_string){
        String result = "";
        for(int i = my_string.length()-1; i >= 0; i--){
            result += my_string.charAt(i);
        }
        return result;
    }
}