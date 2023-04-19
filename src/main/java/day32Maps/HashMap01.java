package day32Maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String,Integer> stdAges=new HashMap<>();
        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);

        //"key"i tekrarlı kulllandığımızda hata vermez, en son verilen entry'nşn değerini alır.
        //Bu yontem value guncellemede kullanılabilir. Buna "overwrite" denir.
        stdAges.put("Tom",83);

        //HashMap'ler entry'leri rastgele sıralar ,bu yüzden çok hızlı çalışır.
        //HashMap'ler entry'leri sıralarken "key"lere bakarak sıralama yapar.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        //replace() methodu "value"ları "key"lerş kullanarak update etmeye yarar.
        stdAges.replace("Ezel", 39);
        System.out.println(stdAges);


        //replace("Angelina",58,61) methodu Map'in içinde "Angelina" 57 varsa 57 yi 61 yapar yoksa donüştürmez
        stdAges.replace("Angelina",58,61);
        System.out.println(stdAges);

        //putIfAbsent("Ali",60); methodu Map'te key olarak yoksa Map'e "Ali" "60" ekler , varsa eklemez.
        stdAges.putIfAbsent("Ali",60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //get() methodu ile ornek "Tom" yazdigimizda Map icinde Tom varsa Java, Tom'u verecek. Var olmayan key icin null verir.
        //getOrDefault() methodunda ise ornek "Tom", 0 yazdigimizda Java bize Tom' key'inin Map'deki value'sunu verir. Ornek
        //sadece 83'u verdi, ayrica key olan Tom'u yazdirmadi. Olmayan key halinde bu method null degil, '0' verir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom",0));//83

        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
        // "get() methodu" ise null verir.
        System.out.println(stdAges.get("Ayşe"));//null
        System.out.println(stdAges.getOrDefault("Ayşe",0));//0

        //containsValue(77); methodu value'lari icerisinde olup olmadigini kontrol eder.
        //containsValue() methodunu Stringlerde var mi diye bakmak icin kullanmistik. Burada da valuelerin icinde o deger
        //var mi diye bakar. Keylerin icinde o deger var mi? Contains methodu her zaman boolean dondurur. Yani true ya da
        //false gorecegiz ekranda. Method icine yazdigimiz ornek 99 yazarsak ve o deger yoksa map icinde bize false verir.
        System.out.println(stdAges.containsValue(77));//true
        System.out.println(stdAges.containsValue(99));//false

        //containsKey("Ali"); methodu key'lerin icerisinde Ali olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));//true
        //containsKey() methodu, Map icinde ilgili key var mi diye bakar.
        //Method icine ornegin "Ali" yazdik ve Map icinde keyler arasinda Ali oldugu icin, sonucta true goruruz.
        //remove() methodlarindan birincisi, key'e bakarak entry'i siliyor. Ornek "Ali" yazdik, ve map icindeki "Ali" cikarildi.
        //Ikinci remove methodu ise hem key'e ham value'ye bakar ve ona gore siler. Ornegin method icine "Tom", 81 yazdik.
        //Tom'u silmez cunku Map'de Tom, 83 idi, 81 olmadigi icin silmez.
        //remove("Ali"); methodu "key"kullanarak entry'i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //remove("Tom",83); methodu Map'te key'si "Tom", value'su 81 olan bir entry varsa onu siler, yoksa silmez
        stdAges.remove("Tom",83);
        System.out.println(stdAges);//{Angelina=61, Ajda=77, Brad=58, Ezel=39}

        HashMap<String,Integer> kidsAge=new HashMap<>();
        kidsAge.put("John",12);
        kidsAge.put("Jin",22);
        kidsAge.put("Jack",32);

        //stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayısıyla değişmiş olur.
        //ama kidsAge Map'i değişmez
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jin=22}
        System.out.println(kidsAge);//{John=12, Jack=32, Jin=22}


    }
}
