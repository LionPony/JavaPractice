//Set of Tests("Codingtest Start Lecture" from school.programmers.co.kr)
import java.util.Scanner;
public class TestSet {
    public static void main(String[] args){
        test1();
    }
    //Calculate share between two nums(integer).
    public static void test1(){
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(Divide.share(num1, num2));
    }
}