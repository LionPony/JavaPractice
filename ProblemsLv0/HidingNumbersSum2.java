//https://school.programmers.co.kr/learn/courses/30/lessons/120864
package ProblemsLv0;

public class HidingNumbersSum2 {
    //Sum every numbers in String.
    public int sum(String my_string){
        int sum = 0;
        StringBuilder word = new StringBuilder();
        String[] line = my_string.split("");
        for(String i : line){
            if(!isInteger(i)){
                if(word.length() != 0){
                    sum += Integer.parseInt(word.toString());
                    word = new StringBuilder();
                }
            }
            else{
                word.append(i);
            }
        }
        if(!word.isEmpty()){
            sum += Integer.parseInt(word.toString());
        }
        return sum;
    }
    //Check letter is integer or not.
    public boolean isInteger(String letter){
        try{
            Integer.parseInt(letter);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
