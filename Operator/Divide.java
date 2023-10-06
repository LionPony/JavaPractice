package Operator;

//Set of divide functions.
public class Divide {
    //num1, num2 are 0~100 integer and this function returns share.
    public int share(int num1, int num2){
        return num1/num2;
    }
    //num1, num2 are 0~100 integer and this function returns remains.
    public int remains(int num1, int num2){
        return num1%num2;
    }
    //divide num1 with num2 and times 1000. Returns only integer.
    public int divideTestExample(int num1, int num2){
        return (int)(((double)num1/num2)*1000);
    }
}