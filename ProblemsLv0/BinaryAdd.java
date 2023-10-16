//https://school.programmers.co.kr/learn/courses/30/lessons/120885
package ProblemsLv0;

import java.util.ArrayList;

public class BinaryAdd {
    //Add binary Strings.
    public String add(String bin1, String bin2){
        int round = 0;
        int digit;
        int digitBin1;
        int digitBin2;
        int times = (bin1.length() >= bin2.length()) ? bin1.length() : bin2.length();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i <= times-1; i++){
            digitBin1 = getDigit(bin1, i);
            digitBin2 = getDigit(bin2, i);
            digit = (round+digitBin1+digitBin2)%2;
            round = (round+digitBin1+digitBin2)/2;
            result.add(digit);
        }
        if(round != 0){
            result.add(round);
        }

        StringBuilder resultFormat = new StringBuilder();
        for(int i = result.size()-1; i >= 0; i--){
            resultFormat.append(result.get(i));
        }
        return resultFormat.toString();
    }
    public int getDigit(String number, int times){
        int num = Integer.parseInt(number);
        for(int i = 0; i < times; i++){
            num /= 10;
        }
        return num%10;
    }
}
