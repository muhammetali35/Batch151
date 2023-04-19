package day33maps;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable01 {
    /*
    "HashMap" ile "Hashtable" arsındaki fark nedir?
    i)"HashMap" "thread-safe" değildir. "HashTable" "thread-safe" dir.
      "HashMap" "synchronized" değildir. "HashTable" "synchronized" dir.
    ii)"HashMap" bir tane "null" key'e ve istediğiniz kadar "null" value'a müsaade eder.
       "Hashtable" key'lerde de value'larda da "null" kullanılmasına müsaade etmez.
    iii)"HashMap" hızlıdır, "Hashtable" "hashMap" e göre daha yavaştır.
      Note: "HashMap" ve "HashTable" ikiside entry'leri rastgele sıralar.


     */
    public static void main(String[] args) {
        Hashtable<String,Integer> stdAges= new Hashtable<>();
        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
        //stdAges.put(null,85); ==> HashTable'larin key'lerin null konulamaz
        //stdAges.put("Chris",null); ==> HashTable'larin value'larina null konulamaz
        stdAges.put("Chris",null);

        System.out.println(stdAges);





    }
}
