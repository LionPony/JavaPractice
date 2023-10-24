// https://school.programmers.co.kr/learn/courses/30/lessons/120924
package ProblemsLv0;

public class NextNumber {
    // Given array is arithmetic or geometric sequence.
    // Find out number which comes after last one in array.
    public int nextNumber(int[] common){
        int a1 = common[0];
        int a2 = common[1];
        int a3 = common[2];

        String sequence;

        if(a2-a1 == a3-a2){
            sequence = "arithmetic";
        }
        else{
            sequence = "geometric";
        }

        return switch (sequence) {
            case "arithmetic" -> common[common.length - 1] + (a2 - a1);
            case "geometric" -> common[common.length - 1] * (a2 / a1);
            default -> throw new IllegalStateException("Unexpected value: " + sequence);
        };
    }
}
