//https://school.programmers.co.kr/learn/courses/30/lessons/120895
package ProblemsLv0;

public class SwitchIndex {
    //Switch char at index.
    public String switchIndex(String my_string, int num1, int num2){
        StringBuilder result = new StringBuilder();
        char tempNum1 = my_string.charAt(num1);
        char tempNum2 = my_string.charAt(num2);

        for(int i = 0; i < my_string.length(); i++){
            if(i == num1){
                result.append(tempNum2);
            }
            else if (i == num2) {
                result.append(tempNum1);
            }
            else{
                result.append(my_string.charAt(i));
            }
        }

        return result.toString();
    }
}
