package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01tekrar {
    public static void main(String[] args) {

            List<String> names = new ArrayList<>();
            names.add("Tom");
            names.add("Alex");
            names.add("Jim");
            names.add("Michael");
            names.add("Mary");
            names.add("Alexander");
            names.add("Alex");

        System.out.println(sonHarfeGoreNaturelOrderTekrarsizBuyukHarfle(names));//[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]
        System.out.println(karakterSayisinaGoreTersSiradaKucukHarfleYazdir(names));//[alexander, michael, alex, alex, mary, jim, tom]
        System.out.println(characterSayisinin2DenBuyukMu(names));//true
        System.out.println(elemanlarinHicbirininCharacterSayisi3DenKucukMu(names));//true
        System.out.println(elemanlarinEnAzBirininCharacterSayisi4denKucukMu(names));//true



    }

    //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.
   //[Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]

    public static List<String> sonHarfeGoreNaturelOrderTekrarsizBuyukHarfle(List<String> names){

        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());
        //Sonucu bir List icinde gormek isterseniz collect(Collectors.toList()) methodu kullanilir.
    }

    //Example 2: List elemanlarini character sayılarına göre ters sırada'da küçük harfle bir list'in içinde return ediniz.
    //Aynı character sayısına sahip elemanlar kendi içinde alfabetik sırada olsun
    //[Tom, Alex, Jim, Michael, Mary, Alexander, Alex]==> Alexander, Michael, Alex, Alex, Mary, Jin,Tom]

    public static List<String> karakterSayisinaGoreTersSiradaKucukHarfleYazdir(List<String> names ){

        return names.stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());

    }

         /* Match
    allMatch() ==> tum elemanlar sarti saglarsa true dondurur
    anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
    noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */

    //Example 3: List elemalrının tamamının character sayısının 2 den büyük olup olmadığını kontrol eden method oluşturunuz.

    public static boolean characterSayisinin2DenBuyukMu(List<String> names){

        return names.stream().allMatch(t->t.length()>2);

    }

    //Example 4: List elemanlarının hiçbirinin character sayısının 3 den kuçuk olmadığını kontrol eden method'u oluşturunuz.

    public static boolean elemanlarinHicbirininCharacterSayisi3DenKucukMu(List<String> names){

        return names.stream().noneMatch(t->t.length()<3);

    }

    //Example 5: List elemanlarının en az birinin character sayısının 4 den küçük olup olmadığını kontrol eden method'u oluşturnuz.

    public static boolean elemanlarinEnAzBirininCharacterSayisi4denKucukMu(List<String> names){

        return names.stream().anyMatch(t->t.length()<4);
    }








}
