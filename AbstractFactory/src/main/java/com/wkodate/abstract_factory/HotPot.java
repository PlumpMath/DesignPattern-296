package com.wkodate.abstract_factory;

import java.util.List;

/**
 * HotPot.java
 *
 * @author wkodate
 *
 */
public class HotPot {

    private final Pot pot;

    private Soup soup;

    private Protein protein;

    private List vegetables;

    private List otheringredients;

    public HotPot(Pot pot) {
        this.pot = pot;
    }

    public void addSoup(Soup soup) {
        this.soup = soup;
    }

    public void addMain(Protein protein) {
        this.protein = protein;
    }

    public void addVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public void addOtheringredients(List<Ingredients> otheringredients) {
        this.otheringredients = otheringredients;
    }

}