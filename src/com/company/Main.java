package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = {"John", "Mark", "Michal"};
        String [] names2 = {names[0], names [1], names[2],"Tom"};

        for (String name : names2) {

            switch (name) {



                case "John":
                    System.out.println("Good Morning "  + name);
                    break;

                case "Mark":
                    System.out.println("Good day " +  name);
                    break;

                case "Michal":
                    System.out.println("Good evening "+ name);
                    break;
                case "Tom":
                    System.out.println("Good bye "  + name);


            }
        }
    }
}