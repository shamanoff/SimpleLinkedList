package com.company;

/**
 * Created by Arthur on 21.06.2016.
 */
public class Link {


    int index;
    char dData;              //data

    Phone next;

    public Link(char dData, int index) {
        this.index=index;
        this.dData = dData;
        next = null;
    }

    public void displayLink(){
        System.out.println("("+index+" "+dData+")");
    }
}
