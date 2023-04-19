package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01tekrar {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jin");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        consoleYazdir(myList);
        tIleBaslayanlarHaricYazdir(myList);//Jin Clara Clara Angelina
        System.out.println();
        characterSayisi4denAzOlanlar(myList);//Tom Jin Tom
        System.out.println();
        characterSayisi4denCokOlanlar(myList);//Clara Clara Angelina
        System.out.println();
        characterSayisi4denCokOlanlarTekrarsiz(myList);//Clara Angelina
        System.out.println();
        tekrarsizBuyuHarfleAlfabetikSirada(myList);//ANGELİNA CLARA JİN TOM
        System.out.println();
        tekrarsizKucukHarfleAlfabetikSirada(myList);//tom jin clara angelina
        System.out.println();






    }
    //Example 1: Bir List'teki elemanları console'a yazdıran methodu oluşturunuz?
    public static void consoleYazdir(List<String> myList) {
        myList.stream().forEach(t-> System.out.println(t));
    }

    //Example 2: Bir list'teki t ile başlayanlar hariç tüm elemanları console'a yazdıran methodu oluşturunuz

    public static void tIleBaslayanlarHaricYazdir(List<String> myList){

        myList.stream().filter(t-> !t.startsWith("T")).forEach(t -> System.out.print(t+" "));

    }

    //Example 3: Bir List'te character sayısı 4 den az olan tum elemanları console'a yazdıran methodu oluşturunuz

    public static void characterSayisi4denAzOlanlar(List<String> myList){
        myList.stream().filter(t -> t.length()<4).forEach(t -> System.out.print(t+" "));
    }

    //Example 4:Bir List'te character sayısı 4 den çok olan tum elemanları buyuk harflerle console'a yazdıran methodu oluşturunuz

    public static void characterSayisi4denCokOlanlar(List<String> myList){
        myList.stream().filter(t -> t.length()>4).forEach(t -> System.out.print(t+" "));
    }

    //Example 5:Bir List'te character sayısı 4 den çok olan tum elemanları tekrarsız olarak küçük harflerle console'a yazdıran methodu oluşturunuz.
    public static void characterSayisi4denCokOlanlarTekrarsiz(List<String> myList){
        myList.stream().distinct().filter(t -> t.length()>4).forEach(t -> System.out.print(t+" "));
    }

    //Example 6:Bir List'te elemanları tekrarsız olarak buyuk harflerle alfabetik sırada console'a yazdıran methoodu oluşturunuz

    public static void tekrarsizBuyuHarfleAlfabetikSirada(List<String> myList){
        myList.stream().distinct().map(t-> t.toUpperCase()).sorted().forEach(t -> System.out.print(t+" "));
    }

    //Example 7:Bir List'te elemanları tekrarsız olarak küçük harflerle uzunluklarına küçükten büyüğe sıralanarak console'a yazdıran methoodu oluşturunuz

    public static void tekrarsizKucukHarfleAlfabetikSirada(List<String> myList){
        myList.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t -> System.out.print(t+" "));
    }




}
