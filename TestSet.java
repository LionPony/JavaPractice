//Set of Tests("Coding test Start Lecture" from school.programmers.co.kr)
import java.time.LocalDate;

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
    public void test7(int num1, int num2) {
        Addition add = new Addition();
        int answer = (num1+num2) == add.sum(num1, num2) ? 1 : -1;
        if (answer == 1) {
            System.out.println("Test7 : PASS");
        } else {
            System.out.println("Test7 : X");
        }
    }
}