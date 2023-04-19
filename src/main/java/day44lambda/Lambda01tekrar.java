package day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01tekrar {
    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file içindeki text'i console'a yazdıran codu'u yazınız.
        Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).forEach(System.out::println);

        //Example 2: Verilen text file içindeki text'i büyük harflerle console'a yazdıran codu'u yaz
        Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3: Verilen text file içindeki text'lerde Java kelimesinin olup olmadığını kontrol eden codu'u yazınız.
        boolean bl=Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println("bl = " + bl);//true

        //Example 4: Verilen text file içindeki text'lerde kullanılan farklı kelimeleri bir list içinde return ediniz.
        List<String> words=Files.
                    lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                    map(t->t.replaceAll("\\p{Punct}","").split(" ")).
                    flatMap(Arrays::stream).
                    distinct().
                    collect(Collectors.toList());
                    System.out.println(words);
        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
                long lettersOf=Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^a-z-A-Z]","")).map(t->t.split("")).flatMap(Arrays::stream).count();
        System.out.println(lettersOf);

        //Example 5: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz.


        List<String> letters =  Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                 map(t->t.replaceAll("[^a-zA-Z]","")).
                         map(t->t.split("")).//split methodu array verir.Bu yüzden flatmap kullanrak onu stream yaparız.
                        flatMap(Arrays::stream).
                         sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                     System.out.println(letters);




    }//main
}
