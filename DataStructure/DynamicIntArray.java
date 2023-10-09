//Dynamic Array. It can handle length himself.
package DataStructure;

public class DynamicIntArray {
    int length;
    int[] intArray;
    public DynamicIntArray() {
        length = 0;
        intArray = new int[length];
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
}