//commented out due to lack of com.company in this file hierarchy.
//package com.company;

//import classes.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
    Komsany's very important touch...
*/
public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Welcome to our over-engineered project...");wait(800);
        System.out.println("I'll be your host, Mohammed Komsany");wait(800);
        breakLine();

        System.out.println("First we have OMAR EL ARABY with Q3"); wait(1000);
        // Omar's code

        List<Integer> filler = Arrays.asList(15,-2,50,1,6,23,0,34,1);
        ArrayList<Integer> test = new ArrayList<>(filler);
        System.out.println("List Before Sorting : " + test); wait(1000);
        sort(test);
        System.out.println("List After  Sorting : " + test); wait(1000);


        breakLine();

        System.out.println("Also MOUSTAFA MAMDOUH with Q3 But with a different approach...(Collections.sort())");wait(1000);
        // Moustafa's Main
        Question3.main(args);

        breakLine();
        System.out.println("You still here? We got two more :D");wait(2000);

        breakLine();

        System.out.println("Q4 By WALID KAMAL");wait(1000);

        // didnt write the testing code so I'm doing it...sigh
        Scanner input  = new Scanner(System.in);
        double side1,side2,side3;
        boolean filled;
        String color;
        System.out.println("Wanna build a triangle? yes lets do it"); wait(2000);

        System.out.print("Enter side 1 : ");  side1 = input.nextDouble();
        System.out.print("Enter side 2 : ");  side2 = input.nextDouble();
        System.out.print("Enter side 3 : ");  side3 = input.nextDouble();

        System.out.print("Whats its color? :"); color = input.next();
        System.out.print("Is it filled? (true or false):"); filled = input.nextBoolean();

        Triangle triangle = new Triangle(color,filled,side1,side2,side3);

        System.out.println("Nice...Here is your triangle ");wait(1500);

        System.out.println(triangle);wait(2500);

        breakLine();

        System.out.println("Lastly we have Q6 also by OMAR EL ARABY");wait(1000);

        GroceryItemOrder item;
        GroceryList groceryList = new GroceryList();
        item = new GroceryItemOrder("Ketchup",12);
        item.setQuantity(5);
        groceryList.add(item);

        item = new GroceryItemOrder("Mayonaise",19);
        item.setQuantity(4);
        groceryList.add(item);

        System.out.println("You Bought 5 Ketchups for 12$ each");wait(1500);
        System.out.println("You Bought 4 Mayonaise for 19$ each");wait(1500);

        System.out.println("Total Price : "+ groceryList.getTotalCost());

        wait(1000);
        wait(1000);
        breakLine();

        System.out.println("Seems like we reached the end...");wait(1500);
        System.out.println("Been a pleasure...Thanks for your time and have a wonderful day!");wait(2000);

    }
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void breakLine(){
        System.out.println();System.out.println();
    }



    public static void sort(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        int index, n = list.size();
        for(int i = 0; i < n; ++i) {
            index = maxIndex(list);
            temp.add(0, list.get(index));
            list.remove(index);
        }
        list.addAll(temp);
    }

    public static Integer maxIndex(ArrayList<Integer> list) {
        int max = list.get(0), index = 0;
        for(int i = 1; i < list.size(); ++i) {
            if(list.get(i) >= max) {
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
}
