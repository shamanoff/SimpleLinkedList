package com.company;

public class SortedList {
    private LinkSort first;
    private  LinkSort last;

    public SortedList() {
        first = null;
        last=null;
    }

    public void insertNum(int insertNum) {
        LinkSort linkSort = new LinkSort(insertNum);
        LinkSort current = first;
        LinkSort prev = null;
        if (isEmpty()) {
            first = linkSort;
            last = linkSort;
        }else {
            while (current != null && insertNum > current.dData  ) {
                prev = current;
                current = current.next;
            }
            if(prev == null){
                linkSort.next = first;
                first = linkSort;
            }else
            if (current == null) {
                prev.next = linkSort;
                last = linkSort;
            }else {
                linkSort.next = current;
                prev.next = linkSort;
            }
        }

    }

    public void display() {
        LinkSort current =first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }

    }

    public void deleteAll() {
        first = null;
    }

    public LinkSort delFirst() {
        LinkSort temp = first;
        first = first.next;
        return temp;
    }



    public boolean isEmpty() {
        return first == null;
    }
}
