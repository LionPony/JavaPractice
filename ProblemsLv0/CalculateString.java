//https://school.programmers.co.kr/learn/courses/30/lessons/120902
package ProblemsLv0;

import java.util.StringTokenizer;

public class CalculateString {
    //Calculate String operation.
    public int calculateString(String my_string){
        StringTokenizer operation = new StringTokenizer(my_string);
        String next;
        String operator;

        int sum = Integer.parseInt(operation.nextToken());

        while (operation.hasMoreTokens()){
            operator = operation.nextToken();
            next = operation.nextToken();
            if(operator.equals("+")){
                sum += Integer.parseInt(next);
            } else if (operator.equals("-")) {
                sum -= Integer.parseInt(next);
            }
        }
        return sum;
    }
}
