package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> filler = Arrays.asList(0,4,2,7,9,23,5,34,678);
        ArrayList<Integer> test = new ArrayList<Integer>(filler);
        System.out.println(test);
        sort(test);
        System.out.println(test);
    }
    public static void sort(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
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
