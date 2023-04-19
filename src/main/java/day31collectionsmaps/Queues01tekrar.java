package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01tekrar {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();

        depo.add("Milk");
        depo.add("Bread");
        depo.add("Cheese");
        depo.add("Egg");

        System.out.println(depo);//[Milk, Bread, Cheese, Egg]

        depo.remove();
        System.out.println(depo);//[Bread, Cheese, Egg]

        System.out.println(depo.size());//3

        System.out.println(depo.peek());//Bread== ilk elemanı alma
        System.out.println(depo.poll());//Bread==Kuyruktan eleman çıkarma
        System.out.println(depo.element());//Cheese

        depo.clear();
        System.out.println(depo);//[]










    }
}