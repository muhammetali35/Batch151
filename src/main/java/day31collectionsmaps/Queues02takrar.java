package day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02takrar {
    public static void main(String[] args) {


    Queue<String> line=new PriorityQueue<>();//Ayrıcalıklı öncelikli

        line.add("Milk");
        line.add("Meat");
        line.add("Bread");
        line.add("Egg");
        line.add("Cheese");

        Deque<String> d= new LinkedList<>();

        d.add("Milk");
        d.add("Egg");
        d.add("Cheese");

        d.addFirst("Bread");
        System.out.println(d);//[Bread, Milk, Egg, Cheese]

        d.addLast("Honey");
        System.out.println(d);//[Bread, Milk, Egg, Cheese, Honey]

        System.out.println(d.removeFirst());//Bread
        System.out.println(d.removeLast());//Honey




    }
}
