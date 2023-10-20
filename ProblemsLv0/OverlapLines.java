//https://school.programmers.co.kr/learn/courses/30/lessons/120876
package ProblemsLv0;

public class OverlapLines {
    //Given arrays are lines. Count overlaps.
    public int overlapLines(int[][] lines){
        //Make line made of int array.
        //length is difference of min and max.
        int max = lines[0][0];
        int min = lines[0][0];
        for (int[] value : lines) {
            for (int j = 0; j < lines[0].length; j++) {
                if (value[j] > max) {
                    max = value[j];
                }
                if (value[j] < min) {
                    min = value[j];
                }
            }
        }
        int[] line = new int[getDifference(max, min)+1];
        //Mark where line overlaps.
        for (int[] ints : lines) {
            for (int j = ints[0]; j < ints[1]; j++) {
                mark(line, j, min);
            }
        }
        //Count line marked more than 2.
        int count = 0;
        for (int i : line) {
            if(i >= 2) {
                count++;
            }
        }
        return count;
    }
    //line[0] is pointer of min. So diff btw min and index is where to mark.
    public void mark(int[] line, int index, int min){
        line[getDifference(index, min)]++;
    }
    //Get diff of two num. Even minus can be calculated.
    public int getDifference(int num1, int num2){
        if(num1 >= num2){
            return (int) Math.sqrt(Math.pow(num1-num2, 2));
        }
        else {
            return (int) Math.sqrt(Math.pow(num2-num1, 2));
        }
    }
}
