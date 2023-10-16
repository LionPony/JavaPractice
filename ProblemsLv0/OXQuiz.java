//https://school.programmers.co.kr/learn/courses/30/lessons/120907
package ProblemsLv0;

import java.util.StringTokenizer;

public class OXQuiz {
    //Make array of operations true or false.
    public String[] oxQuiz(String[] quiz){
        String[] result = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            result[i] = calculate(quiz[i]);
        }
        return result;
    }
    //Calculate String operation.
    public String calculate(String my_string){
        StringTokenizer operation = new StringTokenizer(my_string);
        String next;
        String operator;
        String result = "";

        int sum = Integer.parseInt(operation.nextToken());

        while (operation.hasMoreTokens()){
            operator = operation.nextToken();
            next = operation.nextToken();
            if(operator.equals("+")){
                sum += Integer.parseInt(next);
            }
            else if (operator.equals("-")) {
                sum -= Integer.parseInt(next);
            }
            else if(operator.equals("=")){
                if(Integer.parseInt(next) == sum){
                    result = "O";
                }
                else{
                    result = "X";
                }
            }
        }
        return result;
    }
}
