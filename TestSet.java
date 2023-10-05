//Set of Tests("Coding test Start Lecture" from school.programmers.co.kr)
import java.time.LocalDate;

public class TestSet {
    public static void main(String[] args){
        test1(2, 3);
        test2(3, 4);
        test3(3, 3);
        test4(3, 3);
        test5(40);
        test6(3, 2);
    }

    //Divide test(num1/num2). It returns share.
    public static void test1(int num1, int num2){
        int answer = (num1/num2) == Divide.share(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test1 : PASS");
        }
        else{
            System.out.println("Test1 : X");
        }
    }

    //Subtraction test(num1 - num2)
    public static void test2(int num1, int num2){
        int answer = (num1-num2) == Subtraction.sub(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test2 : PASS");
        }
        else{
            System.out.println("Test2 : X");
        }
    }

    //Boolean test(num1 == num2)
    public static void test3(int num1, int num2){
        int answer = (num1==num2 ? 1:-1) == Boolean.same(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test3 : PASS");
        }
        else{
            System.out.println("Test3 : X");
        }
    }
    //Multiplication test(num1 * num2)
    public static void test4(int num1, int num2){
        int answer = (num1*num2) == Multiplication.times(num1, num2) ? 1:-1;
        if(answer == 1){
            System.out.println("Test4 : PASS");
        }
        else{
            System.out.println("Test4 : X");
        }
    }

    //Get year when born.
    public static void test5(int age){
        LocalDate now = LocalDate.now();
        int thisYear = now.getYear();
        int answer = PrintAge.getBirthYear(age) == (thisYear-age) ? 1:-1;
        if(answer == 1){
            System.out.println("Test5 : PASS");
        }
        else{
            System.out.println("Test5 : X");
        }
    }

    //Divide test(num1%num2)
    public static void test6(int num1, int num2) {
        int answer = (num1%num2) == Divide.remains(num1, num2) ? 1 : -1;
        if (answer == 1) {
            System.out.println("Test6 : PASS");
        } else {
            System.out.println("Test6 : X");
        }
    }
}