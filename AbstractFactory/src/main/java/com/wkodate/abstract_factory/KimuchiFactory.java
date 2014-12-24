package com.wkodate.abstract_factory;

import java.util.List;

public class KimuchiFactory extends Factory {

    @Override
    public Soup getSoup() {
        return null;
    }

    @Override
    public Protein getMain() {
        return null;
    }

    @Override
    public List getVegetables() {
        return null;
    }

    @Override
    public List getOtherIngredients() {
        return null;
    }

}
