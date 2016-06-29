package com.company;

/**
 * Created by Arthur on 21.06.2016.
 */
public class LinkList {
   private Link first;
   private Link last;
    private static int sIndex=0;

    public LinkList() {
        first = null;
        last=null;
    }


    public void insertFirst(char dData){
        Link newLink = new Link(dData,sIndex);
        sIndex++;
        if (isEmpty()){
            newLink.next=null;
            first=newLink;
            last=newLink;
        }else{
            newLink.next=first;
            first=newLink;

        }
    }

    public void insertLast(char dData){
        Link newLink = new Link(dData,sIndex);
        sIndex++;
        if (isEmpty()){
            newLink.next=null;
            first=newLink;
            last=newLink;
        }else{
            newLink.next=null;
            last.next=newLink;
            last=newLink;

        }

    }


    public Link delFirst(){
        if (first!=null)
            sIndex--;
        Link temp = first;
        first=first.next;
        return temp;
    }

    public Link delLast(){
        Link temp = last;
        last=last.next;
        return temp;

    }

    public void displayList(){
        Link curent = first;
        while (curent!=null){
            curent.displayLink();
            curent=curent.next;
        }

    }
    public Link find(int dData){
        Link curent = first;
        while (curent.dData!=dData){
            if (curent.next==null){
                return null;
            } else {
                curent = curent.next;
            }
        }
        return curent;


    }

    public Link delByData(int dData){
        Link curent = first;
        Link prev = null;
        while (curent.dData!= dData){
            if(curent.next == null){
                return null;
            } else{
                prev = curent;
                curent=curent.next;
            }
        }
        if(curent==first){
            first=first.next;
        } else{

        prev.next=curent.next;
            }
        return curent;

    }

    public void insertByNum(char insertChar, int num) {
        Link link = new Link(insertChar, sIndex);
        sIndex++;
        Link curent = first;
        Link prev = null;

        while (curent.index != num && curent != null ) {
            prev = curent;
            curent = curent.next;
        }
        if (curent == null) {
            System.out.println("No num");
            return;
        }

        if (curent == last) {
            link.next = null;
            curent.next = link;
            last = link;

        }else {
            link.next = curent.next;
            curent.next = link;
        }


    }







    public boolean isEmpty(){
        return (first==null);
    }
}
