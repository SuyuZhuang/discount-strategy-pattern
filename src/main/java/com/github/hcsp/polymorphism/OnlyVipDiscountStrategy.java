package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {
    @Override
    public int discount(int price, User user) {
        if (user != null && user.isVip()){
            return (int) (0.95 * price);
        }

        return price;
    }
}
