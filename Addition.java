//Set of addition functions.
public class Addition {
    //Add num1, num2
    public int sum(int num1, int num2){
        return num1+num2;
    }
    //Add all evens before parameter.
    public int addAllEvens(int num){
        int sum = 0;
        int count = 0;
        while(count <= num){
            sum += count;
            count += 2;
        }
        return sum;
    }
}