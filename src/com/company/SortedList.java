package com.company;

public class SortedList {
    LinkSort first;
    LinkSort last;

    public SortedList() {
        first = null;
        last=null;
    }

    public void insertNum(int insertNum) {
        LinkSort linkSort = new LinkSort(insertNum);
        LinkSort current = first;
        if (isEmpty()) {
            first = linkSort;
        }

    }

    public boolean isEmpty() {
        return first == null;
    }
}
