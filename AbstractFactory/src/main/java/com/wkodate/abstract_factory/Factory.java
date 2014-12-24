package com.wkodate.abstract_factory;

import java.util.List;

/**
 * Factory.java
 *
 * @author wkodate
 *
 */
public abstract class Factory {

    public abstract Soup getSoup();

    public abstract Protein getMain();

    public abstract List getVegetables();

    public abstract List getOtherIngredients();

}