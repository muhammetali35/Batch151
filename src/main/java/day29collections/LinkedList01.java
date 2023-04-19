package day29collections;

import java.util.LinkedList;

public class LinkedList01 { //LinkedList'te elemanlara node denir.

    /*
    1)LinkList'ler node silme ve ekleme'de çok başarılı oldukları için,
      silme ve ekleme işlemlerini çoklukla yapacağınız zaman LinkList kullanırız.
    2)ArrayList'ler index'leri adres gibi kullanır. Bu yüzden "search" işlemlerinde
    çok başarılıdır.
    Note: İhtiyacınız olan Collection çoğunlukla silme ve ekleme işlemleri yapacaksa (müze  ziyaretçileri gibi)
    LinkedList, "search" işlemleri yapacaksa(Amerika eyaletleri gibi) ArrayList kullanırız.


     */
    public static void main(String[] args) {

        LinkedList<String> s= new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Müge");
        s.add("Cüneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Müge, Cüneyt, Esra, Ajdar]

        //s.remove(2);//Ajda
        System.out.println(s);

        //s.remove("Ajdar");
        System.out.println(s);//[Kemal, Esra, Esen, Ajda, Müge, Cüneyt, Esra, Ajdar]

        //s.remove();
        System.out.println(s);//[Kemal, Esra, Esen, Ajda, Müge, Cüneyt, Esra]

       // s.removeFirstOccurrence("Esra");//[ Esen, Ajda, Müge, Cüneyt, Esra] ilk "Esra" silindi
        //s.removeLastOccurrence("Esra");
        System.out.println(s);//[Esra, Esen, Ajda, Müge, Cüneyt] sondaki "Esra" silindi

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */
        String r1=s.peek(); //ilk elemanı silmedem size verir.(copy-paste yapar)
        System.out.println(r1);//Kemal
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Müge, Cüneyt, Esra, Ajdar]

        /*
        Retrieves and removes the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */
        String r2=s.poll(); // ilk elemanı verir ve List'den siler (cut-paste yapar)
        System.out.println(r2);//Kemal

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty
        Note:peek() ile elenmet() ikisi de ilk elemanı silmeden size verir.
            Ama peek() list boş ise olduğunda size "null" verir, elenmet() ise "hata" verir.

         */
       String r3= s.element();//İlk elemanı silmeden size verir.(copy-paste)
        System.out.println(r3);//Esra
        System.out.println(s);//[Esra, Steve, Esen, Ajda, Müge, Cüneyt, Esra, Ajdar]

        /*
        Remove and return the first elemet of the this list
        Throws:NoSuchElementException – if this list is empty
        Note:poll() ile elenmet() ikisi de ilk elemanı siler ve  size verir.
        Ama poll() list boş olduğunda size "null" verir, pop() ise "hata" verir.
         */

        String r4=s.pop();
        System.out.println(r4);//Esra
        System.out.println(s);//[Steve, Esen, Ajda, Müge, Cüneyt, Esra, Ajdar]






    }
}
