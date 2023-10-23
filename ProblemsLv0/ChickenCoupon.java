//https://school.programmers.co.kr/learn/courses/30/lessons/120884
package ProblemsLv0;

public class ChickenCoupon {
    // If you order 1 chicken you can get 1 coupon.
    // 10 coupons can be exchanged 1 chicken. And it also gives 1 coupon.
    // Figure out how many complimentary chickens get when you order chicken.
    public int chickenCoupon(int chicken){
        return chickenCouponRecursive(chicken, 0);
    }
    public int chickenCouponRecursive(int chicken, int coupon){
        if(chicken > 0){
            int complimentary = chicken/10;
            coupon += chicken%10;
            if(coupon >= 10){
                complimentary += coupon/10;
                coupon %= 10;
            }
            return complimentary + chickenCouponRecursive(complimentary, coupon);
        }
        else {
            return 0;
        }
    }
}
