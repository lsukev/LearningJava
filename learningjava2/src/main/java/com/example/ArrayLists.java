package com.example;

import java.util.ArrayList;

/**
 * Created by lsuke on 8/5/2016.
 */
public class ArrayLists {
    public static void main(String[] args) {

        ArrayList names = new ArrayList();

        names.add("Carl");
        names.add("Jimmy");
        names.add("That Yellow Dancing Banana");

        System.out.println(names.get(0));

        names.remove("Carl");

        System.out.println(names.get(0));

        names.remove(0);
        System.out.println(names.get(0));
    }
}
