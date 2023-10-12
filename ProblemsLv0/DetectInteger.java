//https://school.programmers.co.kr/learn/courses/30/lessons/120851

package ProblemsLv0;

public class DetectInteger {
    public int detectSum(String my_string){
        int sum = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(detectInteger(my_string.charAt(i))){
                sum += Integer.parseInt(Character.toString(my_string.charAt(i)));
            }
        }
        return sum;
    }
    public boolean detectInteger(Character input){
        try{
            Integer.parseInt(input.toString());
            return true;
        }
        catch (NumberFormatException ex){
            return false;
        }
    }
}
