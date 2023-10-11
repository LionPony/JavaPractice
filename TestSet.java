//Set of Tests("Coding test Start Lecture" from school.programmers.co.kr)
import DataStructure.Array;
import DataStructure.IntList;
import Operator.*;
import ProblemsLv0.*;
import Operator.Boolean;
import java.time.LocalDate;
import java.util.Arrays;

public class TestSet {
    //TestSet
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
        main.test29(150000, 142500);
        main.test30(5500, new int[]{1, 0});
        main.test31("jaron", "noraj");
        main.test32("hello", 3, "hhheeellllllooo");
        main.test33(1234, 10);
        main.test34(new int[]{1, 2, 3, 4, 5}, 1, 3, new int[]{2, 3, 4});
        main.test35(new int[]{1, 2, 3, 4, 5}, 20);
        main.test36("abcdef", "f", "abcde");
        main.test37(100, "baa");
        main.test38(new int[]{3, 76, 24}, new int[]{3, 1, 2});
        main.test39(23, 5);
        main.test40(".... . .-.. .-.. ---", "hello");
        main.test41("205", "052");
        main.test42(20, 17, 1140);
        main.test43(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}});
        main.test44(7, 3);
        main.test45(new int[]{1, 2, 3, 4}, 2, 3);
        main.test46(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}, 3);
        main.test47(new int[]{4, 455, 6, 4, -1, 45, 6}, "left", new int[]{455, 6, 4, -1, 45, 6, 4});
        main.test48(10, 5);
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
    //Check out price automatically
    private void test29(int price , int answer){
        ClothingStore clothingStore = new ClothingStore();
        int test = clothingStore.discount(price);
        if (test == answer) {
            System.out.println("Test29 : PASS");
        } else {
            System.out.println("Test29 : X");
        }
    }
    //How many americano can he drink and checkout changes.
    private void test30(int money , int[] answer){
        IceAmericano iceAmericano = new IceAmericano();
        int[] test = iceAmericano.howManyAmericano(money);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test30 : PASS");
        } else {
            System.out.println("Test30 : X");
        }
    }
    //Make String reversed.
    private void test31(String my_string, String answer){
        StringProblem strReverse = new StringProblem();
        String test = strReverse.reverse(my_string);
        if (test.equals(answer)) {
            System.out.println("Test31 : PASS");
        } else {
            System.out.println("Test31 : X");
        }
    }
    //n times string.
    private void test32(String my_string, int n, String answer){
        StringProblem strTimes = new StringProblem();
        String test = strTimes.nTimesString(my_string, n);
        if (test.equals(answer)) {
            System.out.println("Test32 : PASS");
        } else {
            System.out.println("Test32 : X");
        }
    }
    //Add every digit in integer.
    private void test33(int n, int answer){
        AddEveryDigit addEveryDigit = new AddEveryDigit();
        int test = addEveryDigit.addEveryDigit(n);
        if (test == answer) {
            System.out.println("Test33 : PASS");
        } else {
            System.out.println("Test33 : X");
        }
    }
    //Cut array index of num1 to num2.
    private void test34(int[] numbers, int num1, int num2, int[] answer){
       Array  cutArray = new Array();
        int[] test = cutArray.cutArray(numbers, num1, num2);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test34 : PASS");
        } else {
            System.out.println("Test34 : X");
        }
    }
    //Make product of two numbers max.
    private void test35(int[] numbers, int answer){
        MakeMax makeMax = new MakeMax();
        int test = makeMax.maxProduct(numbers);
        if (test == answer) {
            System.out.println("Test35 : PASS");
        } else {
            System.out.println("Test35 : X");
        }
    }
    //Remove one char in String
    private void test36(String my_string, String letter, String answer){
        EliminateLetter eliminateLetter = new EliminateLetter();
        String test = eliminateLetter.elimiateSpecificChar(my_string, letter);
        if (test.equals(answer)) {
            System.out.println("Test36 : PASS");
        } else {
            System.out.println("Test36 : X");
        }
    }
    //Figure out age in alien language
    private void test37(int age, String answer){
        AlienAge alienAge = new AlienAge();
        String test = alienAge.age(age);
        if (test.equals(answer)) {
            System.out.println("Test37 : PASS");
        } else {
            System.out.println("Test37 : X");
        }
    }
    //Create order of emergency
    private void test38(int[] emergency, int[] answer){
        TreatmentOrder treatmentOrder = new TreatmentOrder();
        int[] test = treatmentOrder.rank(emergency);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test38 : PASS");
        } else {
            System.out.println("Test38 : X");
        }
    }
    //Find out how many ants adjust to kill hp.
    private void test39(int hp, int answer){
        AntCorp antCorp = new AntCorp();
        int test = antCorp.howMany(hp);
        if (test == answer) {
            System.out.println("Test39 : PASS");
        } else {
            System.out.println("Test39 : X");
        }
    }
    //Translate Morse code to English
    private void test40(String letter, String answer){
        MorseCode morseCode = new MorseCode();
        String test = morseCode.translate(letter);
        if (answer.equals(test)) {
            System.out.println("Test40 : PASS");
        } else {
            System.out.println("Test40 : X");
        }
    }
    //Rock(0) Scissors(2) Paper(5) array. Make win array of rsp.
    private void test41(String rsp, String answer){
        RockScissorsPaper rockScissorsPaper = new RockScissorsPaper();
        String test = rockScissorsPaper.winCase(rsp);
        if (answer.equals(test)) {
            System.out.println("Test41 : PASS");
        } else {
            System.out.println("Test41 : X");
        }
    }
    //Combination test.
    private void test42(int balls, int share, int answer){
        Combination combination = new Combination();
        int test = combination.combinationRelation(balls, share);
        if (test == answer) {
            System.out.println("Test42 : PASS");
        } else {
            System.out.println("Test42 : X");
        }
    }
    //Make numlist to 2d array.
    private void test43(int[] numlist, int n, int[][] answer){
        Array array = new Array();
        int[][] test = array.make2d(numlist, n);
        if (Arrays.deepEquals(test, answer)) {
            System.out.println("Test43 : PASS");
        } else {
            System.out.println("Test43 : X");
        }
    }
    //Find num which max num! before given n.
    private void test44(int n, int answer){
        Factorial factorial = new Factorial();
        int test = factorial.maxfactorial(n);
        if (test == answer) {
            System.out.println("Test44 : PASS");
        } else {
            System.out.println("Test44 : X");
        }
    }
    //Find who throws last ball.
    private void test45(int[] numbers, int k, int answer){
        ThrowBall throwball = new ThrowBall();
        int test = throwball.hopping(numbers, k);
        if (test == answer) {
            System.out.println("Test45 : PASS");
        } else {
            System.out.println("Test45 : X");
        }
    }
    //Count baby can babbling
    private void test46(String[] babbling, int answer){
        Babbling countBabbling = new Babbling();
        int test = countBabbling.count(babbling);
        if (test == answer) {
            System.out.println("Test46 : PASS");
        } else {
            System.out.println("Test46 : X");
        }
    }
    //Rotate array given direction.
    private void test47(int[] numbers, String direction, int[] answer){
        RotateArray rotateArray = new RotateArray();
        int[] test = rotateArray.rotate(numbers, direction);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test47 : PASS");
        } else {
            System.out.println("Test47 : X");
        }
    }
    //Find composite number under n
    private void test48(int n, int answer){
        CompositeNumber compositeNumber = new CompositeNumber();
        int test = compositeNumber.count(n);
        if (test == answer) {
            System.out.println("Test48 : PASS");
        } else {
            System.out.println("Test48 : X");
        }
    }
}