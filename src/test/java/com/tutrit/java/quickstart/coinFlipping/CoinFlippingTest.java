package com.tutrit.java.quickstart.coinFlipping;

public class CoinFlippingTest {
    public static void main(String[] args) {

        Coin coin = new Coin();
        for (int i = 0; i < 10; i++) {
            System.out.println(coin.coinFlipping());
        }

    }
}
