//Set of Tests("Coding test Start Lecture" from school.programmers.co.kr)
import java.time.LocalDate;
import java.util.Arrays;

public class TestSet {
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
    }
    //Divide test(num1/num2). It returns share.
    public void test1(int num1, int num2){
        Divide div = new Divide();
        int answer = (num1/num2) == div.share(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test1 : PASS");
        }
        else{
            System.out.println("Test1 : X");
        }
    }
    //Subtraction test(num1 - num2)
    public void test2(int num1, int num2){
        Subtraction sub = new Subtraction();
        int answer = (num1-num2) == sub.sub(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test2 : PASS");
        }
        else{
            System.out.println("Test2 : X");
        }
    }
    //Boolean test(num1 == num2)
    public void test3(int num1, int num2){
        Boolean boo = new Boolean();
        int answer = (num1==num2 ? 1:-1) == boo.same(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test3 : PASS");
        }
        else{
            System.out.println("Test3 : X");
        }
    }
    //Multiplication test(num1 * num2)
    public void test4(int num1, int num2){
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
    public void test5(int age){
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
    //Divide test(num1%num2)
    public void test6(int num1, int num2) {
        Divide div = new Divide();
        int answer = (num1%num2) == div.remains(num1, num2) ? 1 : -1;
        if (answer == 1) {
            System.out.println("Test6 : PASS");
        } else {
            System.out.println("Test6 : X");
        }
    }
    //Addition test(num1+num2)
    public void test7(int num1, int num2) {
        Addition add = new Addition();
        int answer = (num1+num2) == add.sum(num1, num2) ? 1 : -1;
        if (answer == 1) {
            System.out.println("Test7 : PASS");
        } else {
            System.out.println("Test7 : X");
        }
    }
    //Divide Example Test( num1/num2 * 1000 ). returns only integer.
    public void test8(int num1, int num2, int answer){
        Divide div = new Divide();
        int test = div.divideTestExample(num1, num2);
        if (answer == test) {
            System.out.println("Test8 : PASS");
        } else {
            System.out.println("Test8 : X");
        }
    }
    //0 < angle <= 180. Classify angles acute, right, obtuse, square
    public void test9(int angle, int answer){
        Protractor ca = new Protractor();
        int test = ca.classify(angle);
        if (answer == test) {
            System.out.println("Test9 : PASS");
        } else {
            System.out.println("Test9 : X");
        }
    }
    //Add all evens lower than parameter
    public void test10(int num, int answer){
        Addition add = new Addition();
        int test = add.addAllEvens(num);
        if (answer == test) {
            System.out.println("Test10 : PASS");
        } else {
            System.out.println("Test10 : X");
        }
    }
    //Average array of integer
    public void test11(int[] numbers, double answer){
        Addition add = new Addition();
        double test = add.averageArray(numbers);
        if (answer == test) {
            System.out.println("Test11 : PASS");
        } else {
            System.out.println("Test11 : X");
        }
    }
    //Calculate cost of meal. lamb skewers 12,000won, beverage 2,000won.
    //If u have 10 skewers, 1 beverage is free.
    //0<n<1000, n/10 <= k < 1000
    public void test12(int n, int k, int answer){
        LambSkewers ls = new LambSkewers();
        int test = ls.sum(n, k);
        if (answer == test) {
            System.out.println("Test12 : PASS");
        } else {
            System.out.println("Test12 : X");
        }
    }
    //Figure out how much length you need to write message.
    //Space is 2cm, 1 <= message <= 50
    public void test13(String message, int answer){
        Letter letter = new Letter();
        int test = letter.length(message);
        if (answer == test) {
            System.out.println("Test13 : PASS");
        } else {
            System.out.println("Test13 : X");
        }
    }
    //Figure out dot`s quadrant.
    public void test14(int[] dot, int answer){
        Coordinates co = new Coordinates();
        int test = co.figureQuadrant(dot);
        if (answer == test) {
            System.out.println("Test14 : PASS");
        } else {
            System.out.println("Test14 : X");
        }
    }
    //Figure out how many even and odd are included in list.
    public void test15(int[] num_list, int[] answer){
        NumsEvenOdd neo = new NumsEvenOdd();
        int[] test = neo.countEvenOdd(num_list);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test15 : PASS");
        } else {
            System.out.println("Test15 : X");
        }
    }
}