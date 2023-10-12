//https://school.programmers.co.kr/learn/courses/30/lessons/120851
//https://school.programmers.co.kr/learn/courses/30/lessons/120850
package ProblemsLv0;

import java.util.ArrayList;
import java.util.Arrays;

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
    public int[] detectArray(String my_string){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i<my_string.length(); i++) {
            if (detectInteger(my_string.charAt(i))) {
                temp.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }

        int[] result = new int[temp.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = temp.get(i);
        }
        Arrays.sort(result);
        return result;
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
