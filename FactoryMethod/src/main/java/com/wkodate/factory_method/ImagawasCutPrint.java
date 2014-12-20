package com.wkodate.factory_method;

/**
 * ImagawasCutPrint.java
 *
 * @author wkodate
 *
 */
public class ImagawasCutPrint extends CutPrint {

    @Override
    protected void draw(Cuttable hanzai) {
        System.out.println(hanzai.getName() + "に絵を描く");
    }

    @Override
    protected void cut(Cuttable hanzai) {
        System.out.println(hanzai.getName() + "を綺麗に彫る");
    }

    @Override
    protected void print(Cuttable hanzai) {
        System.out.println(hanzai.getName() + "にインクでプリント");
    }

    @Override
    protected Cuttable createCuttable() {
        return new Potato();
    }

}