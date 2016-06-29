package com.company;

public class Stack {

    LinkList linkList = new LinkList();

    public void push(char insertChar){
        linkList.insertFirst(insertChar);

    }

    public char pop (){
       return linkList.delFirst().dData;

    }

    public boolean isEmpty() {
        return  linkList.isEmpty();
    }




}

//вставку и стек сделать (пономеру)
