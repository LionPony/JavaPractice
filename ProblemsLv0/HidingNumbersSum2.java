//https://school.programmers.co.kr/learn/courses/30/lessons/120864
package ProblemsLv0;

public class HidingNumbersSum2 {
    //Sum every numbers in String.
    public int sum(String my_string){
        int sum = 0;
        StringBuilder number = new StringBuilder();
        String[] line = my_string.split("");

        for(String i : line){
            //If meet alphabet add number to sum.
            if(!isInteger(i)){
                if(!number.isEmpty()){
                    sum += Integer.parseInt(number.toString());
                    number = new StringBuilder();
                }
            }
            else{
                number.append(i);
            }
        }
        //Check number is empty.
        if(!number.isEmpty()){
            sum += Integer.parseInt(number.toString());
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
