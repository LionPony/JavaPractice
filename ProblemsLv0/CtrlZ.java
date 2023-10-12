//https://school.programmers.co.kr/learn/courses/30/lessons/120853
package ProblemsLv0;

import java.util.StringTokenizer;

public class CtrlZ {
    //If word is num add. If word is "Z" sub last one.
    public int readLine(String s){
        StringTokenizer words = new StringTokenizer(s);
        String prevWord = "";
        String nowWord;
        int sum = 0;

        while(words.hasMoreElements()){
            nowWord = words.nextToken();
            if(isInteger(nowWord)){
                sum += makeInt(nowWord);
            }
            else{
                sum -= makeInt(prevWord);
            }
            prevWord = nowWord;
        }
        return sum;
    }
    //Make string to int.
    public int makeInt(String s){
        return Integer.parseInt(s);
    }
    //Check word is Int or String.
    public boolean isInteger(String word){
        try{
            Integer.parseInt(word);
            return true;
        }
        catch (NumberFormatException ex){
            return false;
        }
    }
}
