//https://school.programmers.co.kr/learn/courses/30/lessons/120892
package ProblemsLv0;

public class DecodeCipher {
    //Read only 'code'th char.
    public String decode(String cipher, int code){
        StringBuilder result = new StringBuilder();
        for(int i = code-1; i < cipher.length(); i+=code){
            result.append(cipher.charAt(i));
        }
        return result.toString();
    }
}