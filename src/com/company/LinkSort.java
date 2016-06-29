package com.company;

/**
 * Created by Arthur on 21.06.2016.
 */
public class LinkSort {



    int dData;              //data

    LinkSort next;

    public LinkSort( int dData) {

        this.dData = dData;
        next = null;
    }

    public void displayLink(){
        System.out.println("dData"+dData);
    }
}
