//Set of array functions to solve problems.
package Problems;

public class Array {
    //Make integer array reversed.
    public int[] reverseArray(int[] num_list){
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++)
        {
            answer[num_list.length-1-i] = num_list[i];
        }
        return answer;
    }
    //Count Odd, Even in Array.
    public int[] countEvenOdd(int[] num_list){
        int countEven = 0;
        int countOdd = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new int[]{countEven, countOdd};
    }
    //Count n in array.
    public int count(int[] array, int n) {
        int count = 0;
        for(int i : array)
        {
            if(i == n){
                count++;
            }
        }
        return count;
    }
}
