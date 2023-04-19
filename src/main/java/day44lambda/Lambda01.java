package day44lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {
        //Example 1: Verilen text file içindeki text'i console'a yazdıran codu'u yazınız.
        Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).forEach(System.out::println);

        //Example 2: Verilen text file içindeki text'i büyük harflerle console'a yazdıran codu'u yaz
        Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3: Verilen text file içindeki text'lerde Java kelimesinin olup olmadığını kontrol eden codu'u yazınız.
        boolean r1 = Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).anyMatch(t -> t.contains("Java"));
        System.out.println(r1);//true

        //Example 4: Verilen text file içindeki text'lerde kullanılan farklı kelimeleri bir list içinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t -> t.replaceAll("\\p{Punct}", "").split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        /*
        Oncelikle String bir List olusturduk. text'imiz files.lines ve devamini assign ettik. files.lines kismi ile biz
 file'a ulasiriz. Bu satir yanina sirasiyla map methodunu yazdik. Map icinde once noktalama isaretlerini silmemiz ve
 sonrasinda split metodu ile kelimeleri almamiz lazim. Once replaceAll metodu icine {"\\p{Punct}" yazarak noktalama
 isaretlerini sildik ve yine map icinde split metodunu kullandik. split metodu
 icine " " yazarak bosluklar cikarilinca bize kelimeler kaldi. Istersek map'i bir kerede istersek iki
 kez kullanabiliriz. split metodu bize array verir. Kelimelerimiz bir array icinde oldu. map metodu yaninda
  flatMap metodu kullandik. flatMap array icine girmemizi saglar, metni cevreleyen duvarlar flatMap ile kirildi.
   stream icindeki kelimeler ile calisacaksak icine girebilmek icin flatMap kullaniriz. Bu metod icine Arrays::stream
   yazarak ardindan distinct metodunu ekleyerek farkli kelimeleri aldik.

ve collect(Collector.toList) ile kalan tum farkli kelimeleri bir liste koyduk. En son sout icinde listimizin words olan ismini yazarak kodumuzu calistirdik.
         */

        System.out.println(words);

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long numOfLetters = Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t -> t.replaceAll("[^A-Za-z]", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);
        /*
        Once Files.lines...ile textimizi aldik. Harfler disinda ne varsa silebilmemiz icin map metodu icinde
         replaceAll metodunu kullandik. Bu defa bir map icinde birden fazla metod kullanmak yerine ikinci bir
          map metodu yazdik ve icinde split metodunu kullanarak hicliklerden kelimeleri degil, harfleri aldik. Elimizdeki
        harfler bir stream'in ve array'in icinde. Bu elemanlara ulasmak icin array parantezini kirmak icin flatMap
         metodunu yazdik. flatMap icine Arrays::stream yazarak elemanlara ulastik. Devaminda count () metodu kullanmaya
         karar verdik. Cunku bu metod ile toplam harf sayisini alabiliriz. count metodu bize long verir.
        Biz de tum kodumuzu yeni olusturdugumuz long numOfLetters conteynerina assign ettik.
        Son olarak sout icine numOfLetters koyarak kodumuzu calistirdik.
        lambda da bazi metodlar kendisinden sonra metod gosterir, bazi metodlar son kullanim amacli olup, ondan sonra baska metod
         kullanamiyoruz. Ornek anyMatch() ya da count(), forEach() yanlarina nokta koyunca baska metodlari
        ekranda sirali halde goremedik. count() gibi kendisinden sonra metod kullanilmasina musaade etmeyen metodlara terminal method denir.
         */

        //Example 5: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz.

        List<String> letters =   Files.
                lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).//split methodu array verir. Bu yüzden flatmap kullanarak onu stream yaparız.
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);

    }
}