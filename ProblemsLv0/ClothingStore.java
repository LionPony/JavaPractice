package ProblemsLv0;

public class ClothingStore {
    //Return dicounted price
    public int discount(int price){
        if(price >= 100000 && price < 300000){
            return (int)(price*0.95);
        }
        else if(price >= 300000 && price < 500000){
            return (int)(price*0.90);
        } else if (price  >= 500000) {
            return (int)(price*0.80);
        }
        return price;
    }
}
