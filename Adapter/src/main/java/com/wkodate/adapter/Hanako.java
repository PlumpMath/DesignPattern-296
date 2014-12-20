package com.wkodate.adapter;

/**
 * Hanako.java
 *
 * @author wkodate
 *
 */
public class Hanako implements Chairperson{

    private final Taro taro;

    public Hanako() {
        taro = new Taro();
    }

    @Override
    public void organizeClass() {
        taro.enjoyWithAllClassmate();
    }

}