package com.wkodate.abstract_factory;

/**
 * SampleClass.java
 *
 * @author wkodate
 *
 */
public class SampleClass {

    public static void main(String[] args) {
        HotPot hotPot = new HotPot(new Pot());
        Factory factory = createFactory(args[0]);
        hotPot.addSoup(factory.getSoup());
        hotPot.addMain(factory.getMain());
        hotPot.addVegetables(factory.getVegetables());
        hotPot.addOtheringredients(factory.getOtherIngredients());
    }

    private static Factory createFactory(String str) {
        if ("キムチ鍋".equals(str)) {
            return new KimuchiFactory();
        } else {
            return new MizutakiFactory();
        }
    }

}