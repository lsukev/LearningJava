package com.example;

/**
 * Created by lsuke on 8/4/2016.
 */
public class methods {

    public static void main(String[] args) {
        printName();
        printArea(10,5);
        int area = getArea(5,6);
    }

    public static void printName() {

        System.out.println("Hi, my name is Kevin but my friends call me kev!");
    }

    public static void printArea(int length, int width){
        System.out.println("Area: " + (length * width + 1));
    }

    public static int getArea(int length, int width){
        return length * width;
    }
}

