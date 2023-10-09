//https://school.programmers.co.kr/learn/courses/30/lessons/120822

package ProblemsLv0;

public class StringProblem {
    //Make String reversed.
    public String reverse(String my_string){
        String result = "";
        for(int i = my_string.length()-1; i >= 0; i--){
            result += my_string.charAt(i);
        }
        return result;
    }
    //n times string. ex)hello -> hhheeellllllooo.
    public String nTimesString(String my_string, int n){
        String result = "";
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){
                result += my_string.charAt(i);
            }
        }
        return result;
    }
}