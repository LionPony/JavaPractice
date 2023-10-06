package Problems;

//https://school.programmers.co.kr/learn/courses/30/lessons/120821
public class ArrayReverse {
    //Make array of integers order reversed.
    public int[] reverseArray(int[] num_list){
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++)
        {
            answer[num_list.length-1-i] = num_list[i];
        }
        return answer;
    }
}