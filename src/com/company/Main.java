package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  Pharser pharser = new Pharser();
        Scanner scanner = new Scanner(System.in);
        pharser.inverse(scanner.nextLine());*/

        LinkList linkList = new LinkList();
        linkList.insertLast('c');
        linkList.insertLast('d');
        linkList.insertLast('x');
        linkList.insertLast('q');
        linkList.insertLast('a');
        linkList.displayList();

        linkList.insertByNum('z', 1);
        linkList.insertByNum('4', 1);
        linkList.insertByNum('8', 1);
        System.out.println("------------");
        linkList.displayList();







    }
}
