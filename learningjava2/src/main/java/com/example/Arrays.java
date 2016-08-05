package com.example;

/**
 * Created by lsuke on 8/5/2016.
 */
public class Arrays {
    public static void main(String[] args) {
        int [] tomsAverages = new int[3];
        double [] dblArray;
        String[] names = new String[5];

        names[0] = "John";
        names[1] = "Jacob";
        names[2] = "Jingle";
        names[3] = "Heimer";

        tomsAverages[0] = 250;
        tomsAverages[1] = 400;
        tomsAverages[2] = 600;

        System.out.println("Val 1: " + tomsAverages[0]);
        System.out.println("Val 2: " + tomsAverages[1]);
        System.out.println("Val 3: " + tomsAverages[2]);

        tomsAverages[0] = 100;
        System.out.println(tomsAverages[0]);

        String[] top5Cars = {
                "GTR","Aston Martin","Mustang","Lamborghini", "Ferrari"
        };

        System.out.println(top5Cars[2]);
        System.out.println(top5Cars[4]);

        System.out.println("Total Cars: " + top5Cars.length);
        System.out.println("Last Car: " + top5Cars[(top5Cars.length - 1)]);


    }
}
