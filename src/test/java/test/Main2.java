package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> integers1 = new ArrayList<>();
        List<Integer> integers2 = new LinkedList<>();
        integers1.add(10);
        integers1.add(-17);
        integers1.add(18);
        integers1.add(15);
        integers1.add(18);
        integers1.add(117);
        integers2.add(18);
        integers2.add(10);
        integers2.add(111);
        integers2.add(0);
        integers2.add(-1);
        String s1 = integers1.toString();
        String s2 = integers2.toString();
        System.out.println("First container before changes: " + s1);
        System.out.println("Second container before changes: " + s2);

        int z = integers1.set(2, 0);
        int z1 = integers2.set(0, 11);
        integers2.remove(1);
        integers1.remove(3);
        integers2.remove(0);

        String newContainer1 = integers1.toString();
        String newContainer2 = integers2.toString();
        System.out.println("First container after changes: " + newContainer1);
        System.out.println("Second container after changes: " + newContainer2);
    }
}
