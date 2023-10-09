//Set of Tests("Coding test Start Lecture" from school.programmers.co.kr)
import DataStructure.Array;
import Operator.*;
import ProblemsLv0.*;
import Operator.Boolean;
import java.time.LocalDate;
import java.util.Arrays;

public class TestSet {
    //Test
    public static void main(String[] args){
        TestSet main = new TestSet();
        main.test1(2, 3);
        main.test2(3, 4);
        main.test3(3, 3);
        main.test4(3, 3);
        main.test5(40);
        main.test6(3, 2);
        main.test7(2, 3);
        main.test8(7, 3, 2333);
        main.test9(91, 3);
        main.test10(4, 6);
        main.test11(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5.5);
        main.test12(64, 6, 768000);
        main.test13("happy birthday!", 30);
        main.test14(new int[]{2, 4}, 1);
        main.test15(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3});
        main.test16(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
        main.test17(new int[]{1, 1, 2, 3, 4, 5}, 1, 2);
        main.test18(new int[]{149, 180, 1922, 170}, 167, 3);
        main.test19(9, 2, 1, 3, new int[]{29, 6});
        main.test20(new int[]{1, 2, 3, 4, 5}, new int[]{2, 4, 6, 8, 10});
        main.test21(new int[]{9, -1, 0}, 0);
        main.test22(new int[]{1, 2, 3, 3, 3, 4}, 3);
        main.test23(10, new int[]{1, 3, 5, 7, 9});
        main.test24(15, 3);
        main.test25(10, 5);
        main.test26(7, 10, 2);
        main.test27(new String[]{"We", "are", "the", "world!"}, new int[] {2, 3, 3, 6});
        main.test28(20, 6);
    }
    //Operator.Divide test(num1/num2). It returns share.
    private void test1(int num1, int num2){
        Divide div = new Divide();
        int answer = (num1/num2) == div.share(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test1 : PASS");
        }
        else{
            System.out.println("Test1 : X");
        }
    }
    //Operator.Subtraction test(num1 - num2)
    private void test2(int num1, int num2){
        Subtraction sub = new Subtraction();
        int answer = (num1-num2) == sub.sub(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test2 : PASS");
        }
        else{
            System.out.println("Test2 : X");
        }
    }
    //Operator.Boolean test(num1 == num2)
    private void test3(int num1, int num2){
        Boolean boo = new Operator.Boolean();
        int answer = (num1==num2 ? 1:-1) == boo.same(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test3 : PASS");
        }
        else{
            System.out.println("Test3 : X");
        }
    }
    //Operator.Multiplication test(num1 * num2)
    private void test4(int num1, int num2){
        Multiplication mul = new Multiplication();
        int answer = (num1*num2) == mul.times(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test4 : PASS");
        }
        else{
            System.out.println("Test4 : X");
        }
    }
    //Get year when born.
    private void test5(int age){
        PrintAge pa = new PrintAge();
        LocalDate now = LocalDate.now();
        int thisYear = now.getYear();
        int answer = pa.getBirthYear(age) == (thisYear-age) ? 1:-1;
        if(answer == 1){
            System.out.println("Test5 : PASS");
        }
        else{
            System.out.println("Test5 : X");
        }
    }
    //Operator.Divide test(num1%num2)
    private void test6(int num1, int num2) {
        Divide div = new Divide();
        int answer = (num1%num2) == div.remains(num1, num2) ? 1 : -1;
        if (answer == 1) {
            System.out.println("Test6 : PASS");
        } else {
            System.out.println("Test6 : X");
        }
    }
    //Operator.Addition test(num1+num2)
    private void test7(int num1, int num2) {
        Addition add = new Addition();
        int answer = (num1+num2) == add.sum(num1, num2) ? 1 : -1;
        if (answer == 1) {
            System.out.println("Test7 : PASS");
        } else {
            System.out.println("Test7 : X");
        }
    }
    //Operator.Divide Example Test( num1/num2 * 1000 ). returns only integer.
    private void test8(int num1, int num2, int answer){
        Divide div = new Divide();
        int test = div.divideTestExample(num1, num2);
        if (answer == test) {
            System.out.println("Test8 : PASS");
        } else {
            System.out.println("Test8 : X");
        }
    }
    //0 < angle <= 180. Classify angles acute, right, obtuse, square
    private void test9(int angle, int answer){
        Protractor ca = new Protractor();
        int test = ca.classify(angle);
        if (answer == test) {
            System.out.println("Test9 : PASS");
        } else {
            System.out.println("Test9 : X");
        }
    }
    //Add all evens lower than parameter
    private void test10(int num, int answer){
        Addition add = new Addition();
        int test = add.addAllEvens(num);
        if (answer == test) {
            System.out.println("Test10 : PASS");
        } else {
            System.out.println("Test10 : X");
        }
    }
    //Average array of integer
    private void test11(int[] numbers, double answer){
        Addition add = new Addition();
        double test = add.averageArray(numbers);
        if (answer == test) {
            System.out.println("Test11 : PASS");
        } else {
            System.out.println("Test11 : X");
        }
    }
    //Calculate cost of meal(Problems.LambSkewers).
    private void test12(int n, int k, int answer){
        LambSkewers ls = new LambSkewers();
        int test = ls.sum(n, k);
        if (answer == test) {
            System.out.println("Test12 : PASS");
        } else {
            System.out.println("Test12 : X");
        }
    }
    //Figure out how much length you need to write message.
    private void test13(String message, int answer){
        Letter letter = new Letter();
        int test = letter.length(message);
        if (answer == test) {
            System.out.println("Test13 : PASS");
        } else {
            System.out.println("Test13 : X");
        }
    }
    //Figure out dot`s quadrant.
    private void test14(int[] dot, int answer){
        Coordinates co = new Coordinates();
        int test = co.figureQuadrant(dot);
        if (answer == test) {
            System.out.println("Test14 : PASS");
        } else {
            System.out.println("Test14 : X");
        }
    }
    //Figure out how many even and odd are included in list.
    private void test15(int[] num_list, int[] answer){
        Array ceo = new Array();
        int[] test = ceo.countEvenOdd(num_list);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test15 : PASS");
        } else {
            System.out.println("Test15 : X");
        }
    }
    //Make integer array reversed.
    private void test16(int[] num_list, int[] answer){
        Array ar = new Array();
        int[] test = ar.reverseArray(num_list);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test16 : PASS");
        } else {
            System.out.println("Test16 : X");
        }
    }
    //Count integer n in array.
    private void test17(int[] array, int n, int answer) {
        Array countInteger = new Array();
        int test = countInteger.count(array, n);
        if(test == answer)
        {
            System.out.println("Test17 : PASS");
        } else {
            System.out.println("Test17 : X");
        }
    }
    //Count bigger than given height in array
    private void test18(int[] array, int height, int answer) {
        Array countBig = new Array();
        int test = countBig.countBigger(array, height);
        if(test == answer)
        {
            System.out.println("Test18 : PASS");
        } else {
            System.out.println("Test18 : X");
        }
    }
    //Add 2 fraction.
    private void test19(int numer1, int denom1, int numer2, int denom2, int[] answer) {
        Fraction fr = new Fraction();
        int[] test = fr.add(numer1, denom1, numer2, denom2);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test19 : PASS");
        } else {
            System.out.println("Test19 : X");
        }
    }
    //Make array ingredients double(x2).
    private void test20(int[] numbers, int[] answer) {
        Array ar = new Array();
        int[] test = ar.makeDouble(numbers);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test20 : PASS");
        } else {
            System.out.println("Test20 : X");
        }
    }
    //Find median
    private void test21(int[] array, int answer) {
        Array ar = new Array();
        int test = ar.median(array);
        if (answer == test) {
            System.out.println("Test21 : PASS");
        } else {
            System.out.println("Test21 : X");
        }
    }
    //Find mode in integer array
    private void test22(int[] array, int answer){
        Array ar = new Array();
        int test = ar.mode(array);
        if (answer == test) {
            System.out.println("Test22 : PASS");
        } else {
            System.out.println("Test22 : X");
        }
    }
    //Make odd array. odds are positive integer and under parameter n.
    private void test23(int n , int[] answer){
        HateEven hE = new HateEven();
        int[] test = hE.makeOddArray(n);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test23 : PASS");
        } else {
            System.out.println("Test23 : X");
        }
    }
    //Pizza divide (1)
    private void test24(int n, int answer) {
        PizzaDivide pD = new PizzaDivide();
        int test = pD.howManyPlate(n);
        if (test == answer) {
            System.out.println("Test24 : PASS");
        } else {
            System.out.println("Test24 : X");
        }
    }
    //Pizza divide (2)
    private void test25(int n, int answer) {
        PizzaDivide pD = new PizzaDivide();
        int test = pD.equalPlate(n);
        if (test == answer) {
            System.out.println("Test25 : PASS");
        } else {
            System.out.println("Test25 : X");
        }
    }
    //Pizza divide (3)
    private void test26(int slice, int n, int answer) {
        PizzaDivide pD = new PizzaDivide();
        int test = pD.howManyPlate(n, slice);
        if (test == answer) {
            System.out.println("Test26 : PASS");
        } else {
            System.out.println("Test26 : X");
        }
    }
    //Figure out elements(string) length.
    private void test27(String[] strlist , int[] answer){
        Array arraySet = new Array();
        int[] test = arraySet.lengthElements(strlist);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test27 : PASS");
        } else {
            System.out.println("Test27 : X");
        }
    }
    //Find number of ordered pair.
    private void test28(int n , int answer){
        OrderedPair orderedPair = new OrderedPair();
        int test = orderedPair.count(n);
        if (test == answer) {
            System.out.println("Test28 : PASS");
        } else {
            System.out.println("Test28 : X");
        }
    }
}