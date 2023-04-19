package day19arraylists;

import java.util.ArrayList;

public class ArrayList01tekrar {
    public static void main(String[] args) {
        //ArrayList nasıl oluşturulur?
        ArrayList<Integer> ages= new ArrayList<>();

        //ArrayList console'a nasıl yazdırılır?
        System.out.println(ages);//[]

        //ArrayList'e eleman nasıl eklenir?

        ages.add(22);
        ages.add(10);
        ages.add(5);
        ages.add(100);
        System.out.println(ages);//[22, 10, 5, 100]

        //2.Way (istediğin index'e istediğin elemanı ekler.

        ages.add(2,8);
        ages.add(0,33);
        System.out.println(ages);//[33, 22, 10, 8, 5, 100]

        //3.Way // addAll() methodu bir List'i diğer List'in içine yerleştirir.

        ArrayList<Integer> price= new ArrayList<>();
        price.add(999);
        price.add(123);

        ages.addAll(price);
        System.out.println(ages);//[33, 22, 10, 8, 5, 100, 999, 123]

        //4. Way
        ages.addAll(2,price);
        System.out.println(ages);//[33, 22, 999, 123, 10, 8, 5, 100, 999, 123]

        //ArrayList' te eleman sayısı nasıl bulunur?
        int numOfElement=ages.size();
        System.out.println(numOfElement);//10

        //ArrayList'te specific bir eleman nasıl alınır?
        int eleman1= ages.get(3);
        int eleman2= ages.get(2);

        System.out.println(eleman1);//123
        System.out.println(eleman2);//999

        //ArrayList'te specific bir eleman nasıl değiştirilir?

        ages.set(1,35);
        System.out.println(ages);//[33, 35, 999, 123, 10, 8, 5, 100, 999, 123]

        //ArrayList'te specific bir elemanın var olup olmadığını nasıl anlarız?

        boolean r2=ages.contains(35);
        System.out.println(r2);//true

        //Bir ArrayList'in boş olup olmadığını nasıl kontrol ederiz?

        boolean bosMu=ages.isEmpty();
        System.out.println(bosMu);//false

        //Bir ArrayList'teki tüm elemanları nasıl sileriz?
        ages.clear();
        System.out.println(ages);//[]

        boolean bosMu1=ages.isEmpty();
        System.out.println(bosMu1);//true

        // Example 1: Bir List'in boş olup olmadığını kontrol eden kodu yazınız.

        ArrayList<String> names=new ArrayList<>();

        names.add("Kemal");
        names.add("Ajda");
        names.add("Ali");
        names.add("Brad");

        //1.Way

        if(names.size() == 0){
            System.out.println("List boştur");
        }else{
            System.out.println("List boş değildir");
        }

        //2. Way

        if(names.isEmpty()){
            System.out.println("List boş");
        }else {
            System.out.println("List boş değil");
        }



























    }
}
