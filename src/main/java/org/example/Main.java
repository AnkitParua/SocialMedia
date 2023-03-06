package org.example;

import java.util.Scanner;

public class Main {

    static void trail()
    {
        int a;
        String name = "";
        float b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        name = sc.nextLine();
        System.out.println("write your age");
        a = sc.nextInt();
    }

    public static void main(String[] args) {

        System.out.println("Main File -> Going To Controller ");
        Controller Obj_ = new Controller();
//        trail();
//        Temp__Mongo obj = new Temp__Mongo();
//        obj.mongo();

    }
}