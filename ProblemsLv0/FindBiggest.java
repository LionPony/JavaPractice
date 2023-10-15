//https://school.programmers.co.kr/learn/courses/30/lessons/120899
package ProblemsLv0;

public class FindBiggest {
    //Find biggest one and return with index of it.
    public int[] findBiggest(int[] array){
        int max = array[0];
        int[] result = new int[2];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                result[0] = max;
                result[1] = i;
            }
        }
        return result;
    }
}
