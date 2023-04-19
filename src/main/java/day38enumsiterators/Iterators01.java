package day38enumsiterators;

import java.util.*;

public class Iterators01 {
    public static void main(String[] args) {
        /*
     1)Iterator'lar loop'larin yaptigi ayni isi yapar.
    2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3)Iterator'lar ile loop'lar arasinda performans farkı yoktur.
    4)Iterator'lar bir coolection'dan eleman silme ve bir collection'daki elimani degistirme konusunda daha basarilidir.
    5)Iki tip iterator var; i) Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya degistirmek mumkun degildir.
                            ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degitirebilir
                            Note:"Iterator" sadece soldan sağa (ilk elemandan son elemana)çalışır.
                                 "ListIterator" ise iki yönlü çalışabilir.
 */


        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        //"Iterator" kullanımı
        Iterator<String> myItr= myList.iterator();

        while (myItr.hasNext()){//hasNext() pointer'a "senden sonra eleman var mı?" diye sorar.
                                //eleman varsa "true" yoksa "false" döndürür.

            myItr.next();//next() pointer'ı bir sonraki elemanın önüne taşır ve üstünden atladığı elemanı return eder.
            myItr.remove();//next() methodunun return ettiği elemanı siler.
        }
        System.out.println(myList);//[]

        //ListIterator kullanalım

        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

            while (yourListItr.hasNext()) {

            String el=yourListItr.next();
            yourListItr.set(el+"!");//set() methodu List'i uptade etmeye yarar.
        }

        System.out.println(yourList);//[Tom!, Jim!, Clara!]

        //hasPrevious() ve previous() nasıl kullanılır.
        while (yourListItr.hasPrevious()) {
            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?"+ el);

        }
        System.out.println(yourList);


        //En sondan en başa nasıl iterate edebiliriz?

        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();//descendingIterator() LinkList ile kullanılır.

        while (ourListItr.hasNext()){
            String el=ourListItr.next();
            System.out.println(el);
        }




    }
}
