package com.example;

/**
 * Created by lsuke on 8/5/2016.
 */
public class learntocode {

    public static void main(String[] args) {

        if (1 == 1){
            System.out.println("1 does equal 1 lolllzz");
        }

        if (1 != 1){
            System.out.println("whhhhatttttt");
        }

        int accountBalance = 100;
        int itemPrice = 250;

        // GreaterThan >   LessThan <   EqualTo ==  NotEqualTo !=  GreaterThanorEqualTo >=  NotGreaterThanorEqualTo <=
        if (accountBalance >= itemPrice){
            System.out.println("You have purchased the item!");
        }else{
            System.out.println("You don't have enough money! Get a job!");
        }

        int degrees = -60;

        if (degrees >= 70){
            System.out.println("Put on some sunblock!");
        } else if (degrees < 70 && degrees >= 59){
            System.out.println("You might need a sweater!");
        } else {
            System.out.println("Put on a heavy coat!");
        }

        boolean firstTimeCustomer = false;
        boolean executiveMember = true;

        if (firstTimeCustomer == true || executiveMember == true){
            System.out.println("You received a 10% discount!");
        }

        if (firstTimeCustomer || executiveMember){
            System.out.println("You received a 10% discount!");
        }

        if (true == true || false == true && false == true){
            System.out.println("WTF is this");
        }

    }
}
