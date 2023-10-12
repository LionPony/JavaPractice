//https://school.programmers.co.kr/learn/courses/30/lessons/120903
package ProblemsLv0;

public class ArraySimilarity {
    //Count same element in two arrays.
    public int similarity(String[] s1, String[] s2) {
        int count = 0;
        for(String i : s1){
            for(String j : s2){
                if(i.equals(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
