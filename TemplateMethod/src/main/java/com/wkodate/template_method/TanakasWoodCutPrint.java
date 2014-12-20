package com.wkodate.template_method;

/**
 * TanakasWoodCutPrint.java
 *
 * @author wkodate
 *
 */
public class TanakasWoodCutPrint extends WoodCutPrint {

    @Override
    public void draw(Cuttable hanzai) {
        System.out.println(hanzai.getName() + "に絵を描く");
    }

    @Override
    public void cut(Cuttable hanzai) {
        System.out.println(hanzai.getName() + "を彫る");
    }

    @Override
    public void print(Cuttable hanzai) {
        System.out.println(hanzai.getName() + "をプリントする");
    }

}