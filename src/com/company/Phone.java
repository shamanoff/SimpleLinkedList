package com.company;

/**
 * Created by Arthur on 21.06.2016.
 */
public class Phone {


    int index;
    String brand;
    double displaySize;


    Phone next;

    public Phone(int index, String brand, double displaySize) {
        this.index = index;
        this.brand = brand;
        this.displaySize = displaySize;
    }

    public void displayLink(){
        System.out.println("("+index+" "+ brand + " "+ displaySize+")");
    }
}
