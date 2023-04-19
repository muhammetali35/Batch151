package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01tekrar {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();

        names.add("Ali");
        names.add("Veli");
        names.add("Can");
        names.add("Mehmet");
        names.add("Yusuf");
        System.out.println(names);//[Can, Veli, Yusuf, Mehmet, Ali]

        LinkedHashSet<Integer> nums=new LinkedHashSet<>();

        nums.add(38);
        nums.add(12);
        nums.add(5);
        nums.add(99);
        System.out.println(nums);//[38, 12, 5, 99]

        TreeSet<Character> tset=new TreeSet<>();

        tset.add('A');
        tset.add('Z');
        tset.add('K');
        tset.add('P');
        tset.add('S');

        System.out.println(tset);//[A, K, P, S, Z]
        System.out.println(tset.first());//A
        System.out.println(tset.last());//Z
        System.out.println(tset.lower('K'));//A
        System.out.println(tset.higher('K'));//P


    }
}
