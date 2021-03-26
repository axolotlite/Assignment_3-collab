//removed to allow compatibility with the com.company-less prog.
//package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question3 {
    public static  void main(String[] args) {
        //Question.3
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Question.3:\n\tEnter the Numbers to store (enter exit to stop): ");
        while(true)
        {
            list.add(Input.nextInt());
            if(Input.hasNext("exit"))
                break;
        }
        System.out.print("\tArray unsorted: ");
        for(Integer counter: list){
            System.out.print("\t"+counter+"\t");
        }
        sort(list);
        System.out.print("\n\tArray after begin sorted: ");
        for(Integer counter: list){
            System.out.print("\t"+counter+"\t");
        }
    }
    public static void sort(ArrayList<Integer> x)
    {
        Collections.sort(x);
    }
}
