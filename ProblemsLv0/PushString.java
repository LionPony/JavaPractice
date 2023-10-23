// https://school.programmers.co.kr/learn/courses/30/lessons/120921
package ProblemsLv0;

public class PushString {
    // How many pushes need to make A into B. If cant return -1.
    public int pushString(String A, String B){
        //If A, B are same dont need to push.
        if(A.equals(B)){
            return 0;
        }

        String front;
        String back;
        StringBuilder result;
        // Push
        for(int i = A.length()-1; i >= 0; i--){
            front = A.substring(0, i);
            back = A.substring(i);
            result = new StringBuilder();

            result.append(back);
            result.append(front);

            if(result.toString().equals(B)){
                return A.length() - i;
            }
        }
        // B is can not be made by pushing A.
        return -1;
    }
}
