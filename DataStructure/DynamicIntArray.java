//Dynamic Array. It can handle length himself.
package DataStructure;

import java.util.Arrays;

public class DynamicIntArray {
    int length;
    int[] intArray;
    public DynamicIntArray() {
        length = 0;
        intArray = new int[length];
    }
    public DynamicIntArray(int[] array) {
        length = array.length;
        intArray = new int[length];
        for(int i = 0; i < length; i++){
            intArray[i] = array[i];
        }
    }
    //Append new int.
    public void append(int newInt) {
        int[] tempArray = new int[length+1];
        for (int i = 0; i < length; i++) {
              tempArray[i] = intArray[i];
        }
        tempArray[length] = newInt;
        intArray = tempArray;
        length++;
    }
    //Return length.
    public int getLength() {
        return length;
    }
    //Return intArray.
    public int[] getIntArray() {
        return intArray;
    }
    //Sort by ascend
    public void ascendSort(){
        Arrays.sort(intArray);
    }
    public void reverse(){
        int[] reversedArray = new int[length];
        for(int i = length-1, j = 0; i >= 0; i--, j++) reversedArray[j] = intArray[i];
        intArray = reversedArray;
    }
    //Get index of value
    public int indexOf(int value){
        for(int i = 0; i < length; i++){
            if(intArray[i] == value){
                return i;
            }
        }
        return -1;
    }
}