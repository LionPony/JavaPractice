//https://school.programmers.co.kr/learn/courses/30/lessons/120875
package ProblemsLv0;

public class Parallel {
    //Figure out there is parallel lines made by dots.
    public int parallel(int[][] dots){
        //i, j, k, l
        for(int l = 0; l < dots.length; l++) {
            for (int k = 0; k < dots.length; k++) {
                for (int i = 0; i < dots.length; i++) {
                    for (int j = i + 1; j < dots.length; j++) {
                        if(i != j && i!=k && i != l && j != k && j != l && k != l){
                            double inclination = inclination(dots[i], dots[j]);
                            double inclination2 = inclination(dots[k], dots[l]);
                            if(inclination == inclination2){
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public double inclination(int[] dot1, int[] dot2){
        return (double) difference(dot1[1], dot2[1]) / difference(dot1[0], dot2[0]);
    }
    public int difference(int num1, int num2){
        if(num1 >= num2){
            return num1 - num2;
        }
        else {
            return num2 - num1;
        }
    }
}
