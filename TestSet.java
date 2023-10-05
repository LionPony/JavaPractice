//Set of Tests("Coding test Start Lecture" from school.programmers.co.kr)
import java.util.Scanner;
public class TestSet {
    public static void main(String[] args){

    }

    //Divide test(num1/num2). It returns share.
    public static void test1(int num1, int num2){
        System.out.println(Divide.share(num1, num2));
    }

    //Subtraction test(num1 - num2)
    public static void test2(int num1, int num2){
        System.out.println(Subtraction.sub(num1, num2));
    }

    //Boolean test(num1 == num2)
    public static void test3(int num1, int num2){
        System.out.println(Boolean.same(num1, num2));
    }
    //Multiplication test(num1 * num2)
    public static void test4(int num1, int num2){
        System.out.println(Multiplication.times(num1, num2));
    }
}