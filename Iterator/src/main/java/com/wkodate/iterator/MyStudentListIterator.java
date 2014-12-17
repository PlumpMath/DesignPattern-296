package com.wkodate.iterator;

/**
 * MyStudentListIterator.java
 *
 * @author wkodate
 *
 */
public class MyStudentListIterator implements Iterator {

    private final MyStudentList myStudentList;

    private int index;

    public MyStudentListIterator(MyStudentList list) {
        this.myStudentList = list;
        this.index = 0;
    }

    public boolean hasNext() {
        if (myStudentList.getLastNum() > index) {
            return true;
        }
        return false;
    }

    public Object next() {
        Student student = myStudentList.getStudentAt(index);
        index++;
        return student;
    }

}