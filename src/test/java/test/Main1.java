package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1 {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers1 = new LinkedList<>();
        integers1.add(12);
        integers1.add(12);
        integers1.add(18);
        integers1.add(8);
        integers.add(1);
        integers.add(10);
        integers.add(-1);
        int s = integers.size();
        int s1 = integers1.size();
        System.out.println("Size of first container = " + s);
        System.out.println("Size of second container = " + s1);
    }

}