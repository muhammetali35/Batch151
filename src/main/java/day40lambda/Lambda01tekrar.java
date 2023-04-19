package day40lambda;

import day41Lambda.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01tekrar {
    public static void main(String[] args) {
        List<String > iller = new ArrayList<>(Arrays.asList("Van","Gumushane","MUS","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));

    buyukHarfveUzunluklarinaGoreArtanSiradaTekrarsiz(iller);//VAN MUS ORDU HATAY ANKARA EDİRNE KUTAHYA GUMUSHANE GAZİANTEP
    tekrarsizBuyukHarfleSonHarfeGoreSirala(iller);//
        System.out.println();
    buyukHarfleLenghtSiralaTekrarsiz(iller);//
        System.out.println(karakterSayisi5denFazlaOlanlariSil(iller));//[Van, MUS, MUS, Ordu, Hatay]
        System.out.println(hIleBaslayanlarIleUileBitenleriSil(iller));//[Van, MUS, MUS]
        System.out.println(karakterSayilarininKarelerini(iller));//[9, 9, 9]
        System.out.println(karakterSayisiCiftOlanlariYazdir(iller));//[]
        System.out.println(karakterSayisiTekOlanlariYazdir(iller));//[Van, MUS, MUS]

    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void buyukHarfveUzunluklarinaGoreArtanSiradaTekrarsiz(List<String> iller){
        iller.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+" "));

    }
    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz

    public static void tekrarsizBuyukHarfleSonHarfeGoreSirala(List<String> iller){

        iller.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));

    }
    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void buyukHarfleLenghtSiralaTekrarsiz(List<String> iller){

        iller.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
        // Method Referance() ==> forEach(System.out::println); seklinde yazilir

    }

    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz


        public static List<String> karakterSayisi5denFazlaOlanlariSil(List<String> iller){

            iller.removeIf(t->t.length()>5);
            return iller;
        }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz

    public static List<String> hIleBaslayanlarIleUileBitenleriSil(List<String> iller){

        iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));
        return iller;
    }

    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin

    public static List<Integer> karakterSayilarininKarelerini(List<String> iller){
       return iller.stream().map(Utils::karesiniAl).collect(Collectors.toList());

    }

    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> karakterSayisiCiftOlanlariYazdir(List<String> iller){

        return iller.stream().filter(Utils::ciftMi).collect(Collectors.toList());

    }
    //  8) List elemanlarindan karakter sayisi tek sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> karakterSayisiTekOlanlariYazdir(List<String> iller){

        return iller.
                stream().
                filter(Utils::tekMi).
                collect(Collectors.toList());
        //Lambda expression filter(t->t.length() %2 ==0).
    }













}
