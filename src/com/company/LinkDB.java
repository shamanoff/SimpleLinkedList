package com.company;

/**
 * Created by Arthur on 21.06.2016.
 */
public class LinkDB {
   private Phone first;
   private Phone last;
    private static int sIndex=0;

    public LinkDB() {
        first = null;
        last=null;
    }


    public void insertFirst(String brand, double displaySize){
        Phone newLink = new Phone(sIndex, brand, displaySize);
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




/*    public Phone delFirst(){
        if (first!=null)
            sIndex--;
        Phone temp = first;
        first=first.next;
        return temp;
    }

    public Phone delLast(){
        Phone temp = last;
        last=last.next;
        return temp;

    }*/

    public void displayList(){
        Phone curent = first;
        while (curent!=null){
            curent.displayLink();
            curent=curent.next;
        }

    }
    public Phone find(String brandFind){
        Phone curent = first;
        while (!(curent.brand.equals(brandFind))){
            if (curent.next==null){
                return null;
            } else {
                curent = curent.next;
            }
        }
        return curent;


    }











    public boolean isEmpty(){
        return (first==null);
    }
}
