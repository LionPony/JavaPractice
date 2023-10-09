//https://school.programmers.co.kr/learn/courses/30/lessons/120822

package ProblemsLv0;

public class StringProblem {
    //Make String reversed.
    public String reverse(String my_string){
        StringBuilder result = new StringBuilder();
        for(int i = my_string.length()-1; i >= 0; i--){
            result.append(my_string.charAt(i));
        }
        return result.toString();
    }
    //n times string. ex)hello -> hhheeellllllooo.
    public String nTimesString(String my_string, int n){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            result.append(String.valueOf(my_string.charAt(i)).repeat(Math.max(0, n)));
        }
        return result.toString();
    }

}