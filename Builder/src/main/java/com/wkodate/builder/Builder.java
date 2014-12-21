package com.wkodate.builder;

/**
 * Builder.java
 *
 * @author wkodate
 *
 */
public interface Builder {

    public void addSolute(double soluteAmount);

    public void addSolvent(double solventAmount);

    public void abandonSolution(double solutionAmount);

    public Object getResult();

}