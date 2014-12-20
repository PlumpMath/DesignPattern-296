package com.wkodate.template_method;

/**
 * WoodCutPrint.java
 *
 * @author wkodate
 *
 */
public abstract class WoodCutPrint {

    public void createWoodCutPrint() {
        Wood hanzai = new Wood();
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }

    public abstract void draw(Cuttable hanzai);

    public abstract void cut(Cuttable hanzai);

    public abstract void print(Cuttable hanzai);

}