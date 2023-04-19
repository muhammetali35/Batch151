package karisikSorular2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        Elemanları A,C,E ve F olan bir String ArrayList oluşturup ekrana yazdırnız

         */

        List<String> harfler= List.of("A", "C", "E", "F");
        System.out.println(harfler);

        List<String> harfler1=new ArrayList<>(harfler);
        harfler1.add("B");
        harfler1.add(1,"L");

        System.out.println(harfler1);//[A, L, C, E, F, B]

        harfler1.set(3,"D");
        System.out.println(harfler1);//[A, L, C, D, F, B]

        harfler1.remove("F");
        System.out.println(harfler1);//[A, L, C, D, B]

        Collections.sort(harfler1);
        System.out.println(harfler1);//[A, B, C, D, L]


        System.out.println( harfler1.contains("L"));//true
        System.out.println( harfler1.contains("M"));//false

        System.out.println(harfler1.size());//5

        harfler1.clear();
        System.out.println(harfler1);//[]

        System.out.println(harfler1.isEmpty());//true



        //Array'i List'e çevirmek
        String [] arr={"tavşan","serçe"};

        List<String> list= Arrays.asList(arr);
        System.out.println(list);//[tavşan, serçe]
        System.out.println(list.size());//2

        //ArrayList'i Array'e çevirmek

        List<String> list1=new ArrayList<>();
        list1.add("tavşan");
        list1.add("horoz");
        System.out.println(list1);//[tavşan, horoz]
        //1.Way
        String arr1[]= list1.toArray(new String[0]);

        System.out.println(arr1.length);//2
        System.out.println(Arrays.toString(arr1));//[tavşan, horoz]

        //2.Way
        Object arr2[]= list1.toArray();
        System.out.println(arr2.length);//2
        System.out.println(Arrays.toString(arr2));//[tavşan,horoz]



    }
}
