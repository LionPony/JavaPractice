package ProblemsLv0;

import java.util.ArrayList;

public class HateEnglish {
    String[] numbersEnglsh = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    //Written in English to numbers.
    public long expressNumbers(String numbers){
        String number = "";
        ArrayList<Integer> tempResult = new ArrayList<>();

        for(int i = 0; i < numbers.length(); i++){
            number += numbers.charAt(i);
            if(match(number)){
                tempResult.add(getIndex(number));
                number = "";
            }
        }

        String result = "";
        for(int i : tempResult){
            result += i;
        }

        return Long.parseLong(result);
    }
    public boolean match(String number){
        for(String i : numbersEnglsh){
            if(number.equals(i)) {
                return true;
            }
        }
        return false;
    }
    public int getIndex(String number){
        for(int i = 0; i < numbersEnglsh.length; i++){
            if(number.equals(numbersEnglsh[i])){
                return i;
            }
        }
        return -1;
    }
}
