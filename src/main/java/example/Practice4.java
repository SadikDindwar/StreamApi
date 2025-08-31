package example;

import java.util.PriorityQueue;

public class Practice4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pg = new PriorityQueue<>();
//        pg.add(100);
//        pg.add(50);
        pg.add(40);
        pg.add(80);
        pg.add(60);
        pg.add(20);
        pg.add(100);
        System.out.println(pg);
    }
}
