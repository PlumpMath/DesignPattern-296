package com.wkodate.iterator;

/**
 * MyStudentList.java
 *
 * @author wkodate
 */
public class MyStudentList extends StudentList implements Aggregate {

    public MyStudentList(int studentCount) {
        super(studentCount);
    }

    public Iterator iterator() {
        return new MyStudentListIterator(this);
    }

}