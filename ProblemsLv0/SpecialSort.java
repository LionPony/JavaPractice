//https://school.programmers.co.kr/learn/courses/30/lessons/120880
package ProblemsLv0;

public class SpecialSort {
    //Sort by nearest number. If same distance small one comes first.
    public int[] specialSort(int[] numlist, int n){
        int[] difflist = new int[numlist.length];
        //Make diff array.
        for(int i = 0; i < difflist.length; i++){
            difflist[i] = getDifference(numlist[i], n);
        }
        //Selection Sort.
        for(int i = 0; i < difflist.length; i++){
            for(int j = i+1; j < difflist.length; j++){
                if(difflist[i] > difflist[j]){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;

                    temp = difflist[i];
                    difflist[i] = difflist[j];
                    difflist[j] = temp;
                }
            }
        }
        //If same distance small one is after big one.
        for(int i = 0; i < difflist.length-1; i++){
            if(difflist[i] == difflist[i+1]){
                if(numlist[i] < numlist[i+1]){
                    int temp = numlist[i+1];
                    numlist[i+1] = numlist[i];
                    numlist[i] = temp;
                }
            }
        }

        return numlist;
    }
    //Retturn diff btw 2 nums.
    public int getDifference(int num1, int num2){
        if(num1 >= num2){
            return num1-num2;
        }
        else {
            return num2-num1;
        }
    }
}
