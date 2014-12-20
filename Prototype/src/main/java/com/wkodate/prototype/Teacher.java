package com.wkodate.prototype;

/**
 * Teacher.java
 *
 * @author wkodate
 *
 */
public class Teacher {

    public Paper[] createManyCrystals() {
        Paper prototype = new Paper("star");
        drawCrystal(prototype);
        cutAccordanceWithLine(prototype);

        Paper[] papers = new Paper[100];
        for (int n = 0; n < papers.length; n++) {
            papers[n] = (Paper) prototype.createClone();
        }
        return papers;
    }

    private void drawCrystal(Paper paper) {
        // do something
    }

    private void cutAccordanceWithLine(Paper paper) {
        // do something
    }

}