package day19arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    /*
    1) Aynı data type'indaki çoklu dataları depolamak için Array kullanırız.
    2)Array'lerin bir negatif yönü var; içine koyacağınız eleman sayisini en başta balirlemek zorundasınız.
    3)Array'ler eleman sayısında esnek değildirler, bu yüzden Java "ArrayList" adli yeni bir yapı oluşturdu.
     bu yapı eleman sayısında esnektir.Hiç eleman koymazsanız eleman sayısı sıfır olarak ayarlar. 1000
     eleman koyarsanız eleman sayısı 1000 olarak ayarlar.
    4)"ArrayList" yerine sadece "List" de diyebiliriz.
    5) Java "ArrayList"leri oluşturduktan sonra Array'leri iptal etmedi. Çünkü;
            i)Array'ler super hızlıdır.
            ii)Array' ler memory'de çoook az yer kaplar.

    6)Array'ler "primitive data" type'ları ve "reference"ları depolayabilir ama "ArrayList"ler "non-primitive" data type'larını
      depolar bu yuzden "ArrayList" ler Array'lerden daha çok yer kaplar.


     */
    public static void main(String[] args) {

        //ArrayList nasıl oluşturulur?
        ArrayList<Integer> ages=new ArrayList<>();
        System.out.println(ages);//[]

        //ArrayList console'a nasıl yazdırılır?
        System.out.println(ages);

        //ArrayList'e eleman nasıl eklenir?
       //1.Way
        ages.add(12);
        ages.add(24);
        ages.add(9);//add() methodu elemanları "giriş sırası"na(insertion order) göre List'e yerleştirir.
        System.out.println(ages);//[12, 24, 9]

        //2.Way (istediğin index'e istediğin elemanı ekler.
        ages.add(1,99);
        System.out.println(ages);//[12, 99, 24, 9]

        ArrayList<Integer> price= new ArrayList<>();
        price.add(23);
        price.add(33);

        //3.Way // addAll() methodu bir List'i diğer List'in içine yerleştirir
        ages.addAll(price);
        System.out.println(ages);//[12, 99, 24, 9, 23, 33]

        //4:Way
        ages.addAll(3,price);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33]

        //ArrayList'te eleman sayısı nasıl bulunur?
        int numOfElement= ages.size();
        System.out.println(ages);//8

        //ArrayList'te specific bir eleman nasıl alınır?
        int eleman1=ages.get(3);//get() method'u index kullanarak istediğimiz elemanı almaya yarar.
        System.out.println(eleman1);//23

        //ArrayList'te specific bir eleman nasıl değiştirilir?
        ages.set(6,111);//index kullanarak istediğimiz elemanı değiştirebiliz.
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33]

        //ArrayList'te specific bir elemanın var olup olmadığını nasıl anlarız?
        boolean r1=ages.contains(99);
        System.out.println(r1);//true

        boolean r2=ages.contains(199);
        System.out.println(r1);//false

        //Bir ArrayList'in boş olup olmadığını nasıl kontrol ederiz?
        boolean bl=ages.isEmpty();
        System.out.println(bl);//false

        //Bir ArrayList'teki tüm elemanları nasıl sileriz?
        ages.clear();
        System.out.println(ages);//[]

        boolean r3=ages.isEmpty();
        System.out.println(r3);//true

        // Example 1: Bir List'in boş olup olmadığını kontrol eden kodu yazınız.
        ArrayList<String> names= new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1.Way:
        if(names.size()==0){
            System.out.println("List boştur");
        }else {
            System.out.println("List'te en az bir eleman vardır");
        }

        //2.Way Recommended
        if(names.isEmpty()){
            System.out.println("List boştur");
        }else {
            System.out.println("List'te en az eleman vardır.");
        }






    }
}
