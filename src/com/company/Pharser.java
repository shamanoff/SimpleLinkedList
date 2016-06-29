package com.company;

public class Pharser {
    private Stack innerStack;
    //private String inputString;

    public Pharser() {
        innerStack = new Stack();
     //   inputString = "";
    }

    public void inverse(String iverseString) {
        char ch;
        String temp ="";
        for (int i = 0; i < iverseString.length() ; i++) {
            ch = iverseString.charAt(i);
            innerStack.push(ch);

        }

        while (!innerStack.isEmpty()) {
            temp = temp + innerStack.pop();
        }

        System.out.println(temp);


    }


}
