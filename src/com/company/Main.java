package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        LinkDB linkDB = new LinkDB();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("|   Press 1 for insert | Press 2 for find  |  Press 3 print  |  Press 0 for Exit  |");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println( " insert brand ");
                    String brand = scanner.next();
                    System.out.println( " insert displaySize ");
                    Double display = scanner.nextDouble();
                    linkDB.insertFirst(brand, display);
                    break;

                case 2:    System.out.println( " find phone by brand ");
                     brand = scanner.next();
                    linkDB.find(brand).displayLink();
                    break;

                case 3: linkDB.displayList();
                    break;
                case 0:
                    System.out.println( " Exit ");
                    System.exit(-1);

                    break;

            }
        }




       /*
        SortedList sortedList = new SortedList();
       int[] temp = new int[10];
        Random random = new Random();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = random.nextInt(100)-random.nextInt(50);

        }

        System.out.println(Arrays.toString(temp));
        System.out.println("-----------");

        for (int i = 0; i < temp.length ; i++) {
            sortedList.insertNum(temp[i]);
        }

        for (int i = 0; i <temp.length ; i++) {
            temp[i]=sortedList.delFirst().dData;
        }

        System.out.println(Arrays.toString(temp));*/
















    }
}
