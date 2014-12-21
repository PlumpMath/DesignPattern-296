package com.wkodate.builder;

/**
 * Main.java
 *
 * @author wkodate
 *
 */
public class Main {

    public static void main(String[] args) {
        Builder builder = new SaltWaterBuilder();
        Director dir = new Director(builder);
        dir.constract();
        SaltWater saltWater = (SaltWater) builder.getResult();
        System.out.println(saltWater.salt);
        System.out.println(saltWater.water);
    }

}