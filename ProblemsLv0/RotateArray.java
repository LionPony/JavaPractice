package ProblemsLv0;

import DataStructure.IntList;

public class RotateArray {
    public int[] rotate(int[] numbers, String direction){
        IntList intList = new IntList();
        for(int i = 0; i < numbers.length; i++) intList.add(numbers[i]);

        if(direction.equals("right")){
            int temp = intList.getItem(intList.getLength());
            intList.delete(intList.getLength()-1);
            intList.add(temp, 0);
        }
        else if(direction.equals("left")){
            int temp = intList.getItem(0);
            intList.delete(0);
            intList.add(temp);
        }
        return intList.print();
    }
}
