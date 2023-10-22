//Set of Tests("Coding test Start Lecture" from school.programmers.co.kr)
import DataStructure.Array;
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
        main.test49("ab6CDE443fgh22iJKlmn1o", "6CD", 1);
        main.test50("nice to meet you", "nc t mt y");
        main.test51(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}, 2);
        main.test52(new int[]{199, 72, 222}, 1);
        main.test53(144, 1);
        main.test54("aAb1B2cC34oOp", 10);
        main.test55(2, 10, 1024);
        main.test56(12, new int[]{2, 3});
        main.test57("hi12392", new int[]{1, 2, 2, 3, 9});
        main.test58("1 2 Z 3", 4);
        main.test59("people", "peol");
        main.test60(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}, new int[]{6, 9, 12});
        main.test61("cccCCC", "CCCccc");
        main.test62("dfjardstddetckdaccccdegk", 4, "attack");
        main.test63(new int[]{1, 2, -3, 4, -5}, 15);
        main.test64(new int[]{3, 10, 28}, 20, 28);
        main.test65(29423, 2);
        main.test66("onetwothreefourfivesixseveneightnine", 123456789);
        main.test67("hello", 1, 2, "hlelo");
        main.test68("abcabcadc", "d");
        main.test69(24, new int[]{1, 2, 3, 4, 6, 8, 12, 24});
        main.test70(new int[]{1, 8, 3}, new int[]{8, 1});
        main.test71(29183, 1, 3);
        main.test72("Bcad", "abcd");
        main.test73("3 + 4 + 3", 10);
        main.test74(new String[]{"3 - 4 = -3", "5 + 6 = 11"}, new String[]{"X", "O"});
        main.test75("olleh", "hello", 1);
        main.test76(1, 13, 1, 6);
        main.test77("a1aa23a", 24);
        main.test78("1", "10", "11");
        main.test79(new int[]{7, 77, 17}, 4);
        main.test80("abc1Addfggg4556b", 6, new String[] {"abc1Ad", "dfggg4", "556b"});
        main.test81(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}, 1);
        main.test82(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9}, new int[]{0, -4});
        main.test83("x + 1", "x + 1");
        main.test84(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}, 2);
        main.test85(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}, 16);
        main.test86(new int[] {11, 7}, 13);
        main.test87(40, 76);
        main.test88(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}}, 1);
        main.test89(1, 512, 1);
        main.test90(new int[][]{{-1, 1}, {1, 3}, {3, 9}}, 0);
        main.test91(new int[] {600, 400, 300, 200, 700, 800, 100, 900}, 500, new int[]{600, 400, 700, 300, 800, 200, 900, 100});
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
    //Find str1 contains str2.
    private void test49(String str1, String str2, int answer){
        Stringinstring stringinstring= new Stringinstring();
        int test = stringinstring.contains(str1, str2);
        if (test == answer) {
            System.out.println("Test49 : PASS");
        } else {
            System.out.println("Test49 : X");
        }
    }
    //Remove vowel from given string
    private void test50(String my_string, String answer){
        RemoveBowel removeBowel = new RemoveBowel();
        String test = removeBowel.remove(my_string);
        if (answer.equals(test)) {
            System.out.println("Test50 : PASS");
        } else {
            System.out.println("Test50 : X");
        }
    }
    //Check similarity between two arrays.
    private void test51(String[] s1, String[] s2, int answer){
        ArraySimilarity arraySimilarity = new ArraySimilarity();
        int test = arraySimilarity.similarity(s1, s2);
        if (test == answer) {
            System.out.println("Test51 : PASS");
        } else {
            System.out.println("Test51 : X");
        }
    }
    //Check complete condition of triangle.
    private void test52(int[] sides, int answer){
        TriangleComplete triangleComplete = new TriangleComplete();
        int test = triangleComplete.complete(sides);
        if (test == answer) {
            System.out.println("Test52 : PASS");
        } else {
            System.out.println("Test52 : X");
        }
    }
    //Distinct square number.
    private void test53(int n, int answer){
        DistinctSquareNumber distinctSquareNumber = new DistinctSquareNumber();
        int test = distinctSquareNumber.distinct(n);
        if (test == answer) {
            System.out.println("Test53 : PASS");
        } else {
            System.out.println("Test53 : X");
        }
    }
    //Detect Integer and sum.
    private void test54(String my_string, int answer){
        DetectInteger detectInteger = new DetectInteger();
        int test = detectInteger.detectSum(my_string);
        if (test == answer) {
            System.out.println("Test54 : PASS");
        } else {
            System.out.println("Test54 : X");
        }
    }
    // Tth power of n
    private void test55(int n, int t, int answer){
        Power power = new Power();
        int test = power.power(n, t);
        if (test == answer) {
            System.out.println("Test55 : PASS");
        } else {
            System.out.println("Test55 : X");
        }
    }
    //Factorization given n.
    private void test56(int n, int[] answer){
        Factorization factorization = new Factorization();
        int[] test = factorization.factorization(n);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test56 : PASS");
        } else {
            System.out.println("Test56 : X");
        }
    }
    //Detect Integer and return int array of it.
    private void test57(String my_string, int[] answer){
        DetectInteger detectInteger = new DetectInteger();
        int[] test = detectInteger.detectArray(my_string);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test57 : PASS");
        } else {
            System.out.println("Test57 : X");
        }
    }
    //If word is num add. If word is "Z" sub last one.
    private void test58(String s, int answer){
        CtrlZ ctrlZ = new CtrlZ();
        int test = ctrlZ.readLine(s);
        if (test == answer) {
            System.out.println("Test58 : PASS");
        } else {
            System.out.println("Test58 : X");
        }
    }
    //If char already seen one. Remove it.
    private void test59(String my_string, String answer){
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        String test = removeDuplicate.removeDuplicate(my_string);
        if (answer.equals(test)) {
            System.out.println("Test59 : PASS");
        } else {
            System.out.println("Test59 : X");
        }
    }
    //Select n`s multiples in array. Remove others.
    private void test60(int n, int[] numlist, int[] answer){
        FindMultiples findMultiples = new FindMultiples();
        int[] test = findMultiples.makeMultipleArray(n, numlist);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test60 : PASS");
        } else {
            System.out.println("Test60 : X");
        }
    }
    //Upper case to lower case, vice versa.
    private void test61(String my_string, String answer){
        UpperLower upperLower = new UpperLower();
        String test = upperLower.upperLower(my_string);
        if (test.equals(answer)) {
            System.out.println("Test61 : PASS");
        } else {
            System.out.println("Test61 : X");
        }
    }
    //Decode Cipher
    private void test62(String cipher, int code, String answer){
        DecodeCipher decodeCipher = new DecodeCipher();
        String test = decodeCipher.decode(cipher, code);
        if (test.equals(answer)) {
            System.out.println("Test62 : PASS");
        } else {
            System.out.println("Test62 : X");
        }
    }
    //MakeMax(2)
    private void test63(int[] numbers, int answer){
        MakeMax makeMax = new MakeMax();
        int test = makeMax.maxProduct(numbers);
        if (test == answer) {
            System.out.println("Test63 : PASS");
        } else {
            System.out.println("Test63 : X");
        }
    }
    //Find the closest num in array.
    private void test64(int[] numbers, int n, int answer){
        ClosestNum closeNum = new ClosestNum();
        int test = closeNum.findClosest(numbers, n);
        if (test == answer) {
            System.out.println("Test64 : PASS");
        } else {
            System.out.println("Test64 : X");
        }
    }
    //Count how many 3, 6, 9 in given number.
    private void test65(int order, int answer){
        ThreeSixNine threeSixNine = new ThreeSixNine();
        int test = threeSixNine.countClap(order);
        if (test == answer) {
            System.out.println("Test65 : PASS");
        } else {
            System.out.println("Test65 : X");
        }
    }
    //Written in English to numbers.
    private void test66(String numbers, long answer){
        HateEnglish hateEnglish = new HateEnglish();
        long test = hateEnglish.expressNumbers(numbers);
        if (test == answer) {
            System.out.println("Test66 : PASS");
        } else {
            System.out.println("Test66 : X");
        }
    }
    //Switch char at index.
    private void test67(String my_string, int num1, int num2, String answer){
        SwitchIndex switchIndex = new SwitchIndex();
        String test = switchIndex.switchIndex(my_string, num1, num2);
        if (test.equals(answer)) {
            System.out.println("Test67 : PASS");
        } else {
            System.out.println("Test67 : X");
        }
    }
    //Leave only once appeared.
    private void test68(String s, String answer){
        AppearOnlyOnce appearOnlyOnce = new AppearOnlyOnce();
        String test = appearOnlyOnce.appearOnlyOnce(s);
        if (test.equals(answer)) {
            System.out.println("Test68 : PASS");
        } else {
            System.out.println("Test68 : X");
        }
    }
    //Find all divisor.
    private void test69(int n, int[] answer){
        FindDivisor findDivisor = new FindDivisor();
        int[] test = findDivisor.findDivisor(n);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test69 : PASS");
        } else {
            System.out.println("Test69 : X");
        }
    }
    //Find the biggest one and return with index of it.
    private void test70(int[] array, int[] answer){
        FindBiggest findBiggest = new FindBiggest();
        int[] test = findBiggest.findBiggest(array);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test70 : PASS");
        } else {
            System.out.println("Test70 : X");
        }
    }
    //Find index of given.
    private void test71(int num, int k, int answer){
        FindNumber findnumber = new FindNumber();
        int test = findnumber.findNumber(num, k);
        if (test == answer) {
            System.out.println("Test71 : PASS");
        } else {
            System.out.println("Test71 : X");
        }
    }
    //Turn every character lower case and sort ascending order.
    private void test72(String my_string, String answer){
        SortString2 sortString2 = new SortString2();
        String test = sortString2.lowerSorted(my_string);
        if (test.equals(answer)) {
            System.out.println("Test72 : PASS");
        } else {
            System.out.println("Test72 : X");
        }
    }
    //Calculate String operation.
    private void test73(String my_string, int answer){
        CalculateString calculateString = new CalculateString();
        int test = calculateString.calculateString(my_string);
        if (test == answer) {
            System.out.println("Test73 : PASS");
        } else {
            System.out.println("Test73 : X");
        }
    }
    //Make array of operations true or false.
    private void test74(String[] quiz, String[] answer){
        OXQuiz oxQuiz = new OXQuiz();
        String[] test = oxQuiz.oxQuiz(quiz);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test74 : PASS");
        } else {
            System.out.println("Test74 : X");
        }
    }
    //Check out before can be after.
    private void test75(String before, String after, int answer){
        MakeAfromB makeAfromB = new MakeAfromB();
        int test = makeAfromB.makeAfromB(before, after);
        if (test == answer) {
            System.out.println("Test75 : PASS");
        } else {
            System.out.println("Test75 : X");
        }
    }
    //How many letter k appers in i~j.
    private void test76(int i, int j, int k, int answer){
        CountKEach countKEach = new CountKEach();
        int test = countKEach.countKEach(i, j, k);
        if (test == answer) {
            System.out.println("Test76 : PASS");
        } else {
            System.out.println("Test76 : X");
        }
    }
    //Sum every number in String.
    private void test77(String my_string, int answer){
        HidingNumbersSum2 hidingNumbersSum2 = new HidingNumbersSum2();
        int test = hidingNumbersSum2.sum(my_string);
        if (test == answer) {
            System.out.println("Test77 : PASS");
        } else {
            System.out.println("Test77 : X");
        }
    }
    //Add binary Strings.
    private void test78(String bin1, String bin2, String answer){
        BinaryAdd binaryAdd = new BinaryAdd();
        String test = binaryAdd.add(bin1, bin2);
        if (test.equals(answer)) {
            System.out.println("Test78 : PASS");
        } else {
            System.out.println("Test78 : X");
        }
    }
    //Count how many '7' appears in integer array.
    private void test79(int[] array, int answer){
        NumbersOfSeven numbersOfSeven = new NumbersOfSeven();
        int test = numbersOfSeven.numbersOfSeven(array);
        if (test==answer) {
            System.out.println("Test79 : PASS");
        } else {
            System.out.println("Test79 : X");
        }
    }
    //Substring and save it in array.
    private void test80(String my_str, int n, String[] answer){
        SubstringSaveArray substringSaveArray = new SubstringSaveArray();
        String[] test = substringSaveArray.substringSaveArray(my_str, n);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test80 : PASS");
        } else {
            System.out.println("Test80 : X");
        }
    }
    //Figure out Rectangle area.
    private void test81(int[][] dots, int answer){
        RectangleArea rectangleArea = new RectangleArea();
        int test = rectangleArea.rectangleArea(dots);
        if (test == answer) {
            System.out.println("Test81 : PASS");
        } else {
            System.out.println("Test81 : X");
        }
    }
    //Find out where is character.
    private void test82(String[] keyinput, int[] board, int[] answer){
        CoordinateOfCharacter coordinateOfCharacter = new CoordinateOfCharacter();
        int[] test = coordinateOfCharacter.coordinateOfCharacter(keyinput, board);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test82 : PASS");
        } else {
            System.out.println("Test82 : X");
        }
    }
    //Make polynomial shorten.
    private void test83(String polynomial, String answer){
        PolynomialAdd polynomialAdd = new PolynomialAdd();
        String test = polynomialAdd.polynomialAdd(polynomial);
        if (test.equals(answer)) {
            System.out.println("Test83 : PASS");
        } else {
            System.out.println("Test83 : X");
        }
    }
    //Find the word can be made by spell in dic.
    private void test84(String[] spell, String[] dic, int answer){
        AlienDictionary alienDictionary = new AlienDictionary();
        int test = alienDictionary.alienDictionary(spell, dic);
        if (test == answer) {
            System.out.println("Test84 : PASS");
        } else {
            System.out.println("Test84 : X");
        }
    }
    //Find safe zone.
    private void test85(int[][] board, int answer){
        SafeZone safeZone = new SafeZone();
        int test = safeZone.safeZone(board);
        if (test == answer) {
            System.out.println("Test85 : PASS");
        } else {
            System.out.println("Test85 : X");
        }
    }
    //Count cannable triangle.
    private void test86(int[] sides, int answer){
        TriangleComplete2 triangleComplete2 = new TriangleComplete2();
        int test = triangleComplete2.triangleComplete2(sides);
        if (test == answer) {
            System.out.println("Test86 : PASS");
        } else {
            System.out.println("Test86 : X");
        }
    }
    //Translate decimal system to Cursed vileage use.
    private void test87(int n, int answer){
        CursedNum3 cursedNum3 = new CursedNum3();
        int test = cursedNum3.cursedNum3(n);
        if (test == answer) {
            System.out.println("Test87 : PASS");
        } else {
            System.out.println("Test87 : X");
        }
    }
    //Figure out there is parallel lines made by dots.
    private void test88(int [][] dots, int answer){
        Parallel parallel = new Parallel();
        int test = parallel.parallel(dots);
        if (test == answer) {
            System.out.println("Test88 : PASS");
        } else {
            System.out.println("Test88 : X");
        }
    }
    //Distinguish a/b is finite decimal number.
    private void test89(int a, int b, int answer){
        FiniteDecimalNumber finiteDecimalNumber = new FiniteDecimalNumber();
        int test = finiteDecimalNumber.finiteDecimalNumber(a, b);
        if (test == answer) {
            System.out.println("Test89 : PASS");
        } else {
            System.out.println("Test89 : X");
        }
    }
    //Given arrays are lines. Count overlaps.
    private void test90(int[][] lines, int answer){
        OverlapLines overlapLines = new OverlapLines();
        int test = overlapLines.overlapLines(lines);
        if (test == answer) {
            System.out.println("Test90 : PASS");
        } else {
            System.out.println("Test90 : X");
        }
    }
    //Sort by nearest number. If same distance small one comes first.
    private void test91(int[] numlist, int n, int[] answer){
        SpecialSort specialSort = new SpecialSort();
        int[] test = specialSort.specialSort(numlist, n);
        if (Arrays.equals(test, answer)) {
            System.out.println("Test91 : PASS");
        } else {
            System.out.println("Test91 : X");
        }
    }
}