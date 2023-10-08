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
    //Count bigger integer in array.
    public int countBigger(int[] array, int height) {
        int count = 0;
        for(int i : array){
            if(i > height){
                count++;
            }
        }
        return count;
    }
    //Make array ingredients double.
    public int[] makeDouble(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
    //Bubble Sort. Recursive used.
    public int[] bubbleSort(int[] array, int length){
        int temp;
        int i;
        for(i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }
        }
        if(length > 0){
            return bubbleSort(array, length-1);
        }
        return array;
    }
    //Find median.
    public int median(int[] array) {
        array = bubbleSort(array, array.length);
        return array[array.length/2];
    }
    // Find mode.
    public int mode(int[] array){
        //Preprocess making hashmap
        int[] index = new int[max(array)+1];
        for(int i : array){
            index[i]++;
        }

        int modeCount = max(index);

        //Exception Handling if modes are more than 2.
        if(count(index, modeCount) >= 2){
            return -1;
        }
        return findKeyByValue(index, modeCount);
    }
    //Find value in key array. If couldn`t find return -1.
    public int findKeyByValue(int[] array, int value){
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
    //Find max in array
    public int max(int[] array){
        int max = 0;
        for(int i : array){
            if( i > max){
                max = i;
            }
        }
        return max;
    }
}
