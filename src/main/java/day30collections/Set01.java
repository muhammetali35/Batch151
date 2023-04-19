package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    /*
    1)Set'ler tekrarsız eleman (unique) depolamak için kullanılır.
    2) 3 tane Set Class vardır;
       i) HashSet Class
            "Hash" benzersiz id oluşturma tekniğidir. Bu tekniğe "Hashing Technique" denir.
            "HashSet" elemanları rastgele sıralar.
            "HashSet" elemanları sıralamadığından çok hızlı çalışır.
            "HashSet" null'ı eleman olarak kabul eder.
            "HashSet" tekrarsız eleman deppolamak içindir.

       ii) LinkedHashSet Class
            "LinkedHashSet" elemanları sizin verdiğiniz sıraya göre dizdiğinden(insertion order)
                HashSet'lere göre yavaştır.
            "LinkedHashSet" tekrarsız eleman depolamak içindir.

       iii) TreeSet Class
            "TreeSet"ler elemanları natural order'a göre dizerler.
            "TreeSet"ler elemanları natural order'a göre dizdiğnden çok yavaştırlar.
            En yavaş Set "TreeSet"dir.
       3)TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz
     */
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();

        hs.add("Ajda");
        hs.add("Cüneyt");
        hs.add("Cüneyt");//Tekrarlı eleman eklediğimizde hat vermez tekrarlı elemanı sadece bir kez yazdırır.
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add(null);//[null, Zeki, Ajda, Cüneyt, Esra, Ezel] null ı0 kabul ettiğinden en başa yazar.
        hs.add(null);

        System.out.println(hs);
        System.out.println(hs.hashCode());//-2131540013 (hiç kullanılmaz )

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);

        System.out.println(lhs);//[234, 87, -32, 124]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124] ==> ilk LinkedHashSet'de farklı elemanlar silindi.
        System.out.println(ls);//[451, 87, 231, 124]

        TreeSet<Character> ts=new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
       // ts.add(null); TreeSet'lere null eklenemez.

        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z
        System.out.println(ts.lower('R'));//G ==>  Verilen eleman R'den bir önceki elemanı verir.
        System.out.println(ts.lower('D'));//A
        System.out.println(ts.lower('A'));//null
        System.out.println(ts.higher('K'));//R ==> vVerilen K'den sonraki elemanı verir.

        System.out.println(ts.headSet('R'));//[A, G] ==> Parantez içindeki R dahil değildir.

        System.out.println(ts.tailSet('G')); //[G, R, U, Z] ==> Parantez içindeki 'G' dahildir.

        System.out.println( ts.headSet('R',true)); //[A, G, R]  R ==> dahil eder.

        System.out.println(ts.tailSet('G',false)); //[R, U, Z] G dahil değildir.

        System.out.println(ts.ceiling('R'));//R ==> Eleman set'in içinde varsa elemanın kendisini return eder.
        System.out.println(ts.ceiling('K'));//R ==> Eleman set'in içinde yoksa sonraki elemanı return eder.

        System.out.println(ts.floor('G'));//G==> Eleman set'in içinde varsa elemanın kendisini return eder
        System.out.println(ts.floor('J'));//G==> Eleman set'in içinde yoksa önceki elemanı return eder


        System.out.println(ts.subSet('G','Z')); //[G, R, U] ==> Ilk parametre dahil ikinci parametra haric





    }
}
