//https://school.programmers.co.kr/learn/courses/30/lessons/120863
package ProblemsLv0;

import java.util.*;

public class PolynomialAdd {
    //Make polynomial shorten.
    public String polynomialAdd(String polynomial){
        if(polynomial.charAt(0) != '+' || polynomial.charAt(0) != '-'){
            polynomial = " + " + polynomial;
        }

        StringTokenizer elements = new StringTokenizer(polynomial);
        HashMap<String, Integer> variables =new HashMap<>();
        String operator;
        String element;

        while(elements.hasMoreTokens()){
            operator = elements.nextToken();
            element = elements.nextToken();
            //Add.
            if(operator.equals("+")){
                //Classify it has variable.
                if (isInteger(element)) {
                    int number = Integer.parseInt(element);
                    if(variables.containsKey("")){
                        //Operation in hashmap.
                        variables.put("", variables.get("") + number);
                    }
                    else{
                        //If there is nothing to add.
                        variables.put("", number);
                    }
                }
                else {
                    //Seperate number and variable.
                    int number;
                    if(element.matches("(.*)[0-9](.*)")){
                        number = Integer.parseInt(element.substring(0, element.length()-1));
                    }
                    else {
                        number = 1;
                    }
                    String variable = element.substring(element.length()-1);


                    if(variables.containsKey(variable)){
                        //Operation in hashmap.
                        variables.put(variable, variables.get(variable) + number);
                    }
                    else{
                        //If there is nothing to add.
                        variables.put(variable, number);
                    }
                }
            }
            //Substration
            else if(operator.equals("-")){
                //Classify it has variable.
                if (isInteger(element)) {
                    int number = Integer.parseInt(element);
                    if(variables.containsKey("")){
                        //Operation in hashmap.
                        variables.put("", variables.get("") - number);
                    }
                    else{
                        //If there is nothing to add.
                        variables.put("", -1*number);
                    }
                }
                else {
                    //Seperate number and variable.
                    int number;
                    if(element.matches("(.*)[0-9](.*)")){
                        number = Integer.parseInt(element.substring(0, element.length()-1));
                    }
                    else {
                        number = 1;
                    }
                    String variable = element.substring(element.length()-1);


                    if(variables.containsKey(variable)){
                        //Operation in hashmap.
                        variables.put(variable, variables.get(variable) - number);
                    }
                    else{
                        //If there is nothing to add.
                        variables.put(variable, -1*number);
                    }
                }
            }
        }

        //Printing.
        List<String> keySet = new ArrayList<>(variables.keySet());
        Collections.reverse(keySet);

        StringBuilder result = new StringBuilder();
        Iterator<String> scan = keySet.iterator();
        String key;

        while(scan.hasNext()){
            key = scan.next();
            if(!key.equals("")){
                if(variables.get(key) != 0 && variables.get(key) != 1){
                    result.append(variables.get(key));
                }
            }
            else{
                result.append(variables.get(key));
            }
            result.append(key);
            if(scan.hasNext()){
                result.append(" + ");
            }
        }
        return result.toString();
    }
    //Classify integer or not.
    public boolean isInteger(String term){
        try{
            Integer.parseInt(term);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
