//https://school.programmers.co.kr/learn/courses/30/lessons/120913
package ProblemsLv0;

public class SubstringSaveArray {
    //Substring and save it in array.
    public String[] substringSaveArray(String my_str, int n){
        int count = 0;
        int scan = 0;
        StringBuilder element = new StringBuilder();
        String[] result = new String[ceilDiv(my_str.length(), n)];
        //If count meets n append element.
        for(int i = 0; i < my_str.length(); i++){
            element.append(my_str.charAt(i));
            count++;
            if(count == n){
                result[scan] = element.toString();
                count = 0;
                scan++;
                element = new StringBuilder();
            }
        }
        //Flush element.
        if(!element.isEmpty()){
            result[scan] = element.toString();
        }
        return result;
    }
    public int ceilDiv(double num1, double num2){
        double result = num1 / num2;
        int ceil = (int) result;
        if(ceil < result){
            return ceil+1;
        }
        return ceil;
    }
}
