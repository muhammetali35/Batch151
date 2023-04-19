package day19arraylists;

import java.util.ArrayList;
import java.util.List;

        /*
        Bir methodu öğrenirken aşağıdaki 3 maddeyi öğrenmeliyiz
        1)O method ne iş yapar?
        2)O method nasıl kullanılır?
        3)O method size neyi verir?
         */

public class ArrayList02 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Giresun");

        //ArrayList'te bir elemanın "ilk görünümü" nasıl siinir?
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities.remove("Adana"));//false
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList'te bir eleman index'i kullanarak nasıl silinir?
        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun]


        //ArrayList oluştururken en başa ArrayList yerine List yazabiliriz.Sebebini Collections konusunda görecez
        List<Integer> ages = new ArrayList<>();

        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example 1: 12 elemanını ages List'ten siliniz
        ages.remove((Integer) 12);//Primitive int remove() içinde kullanılırsa Java onu index zanneder.
        //Java'ya 12 nin index olmadığını söylemek için primitive int yerine wrapper
        // class interger kullanmalıyız.
        System.out.println("ages = " + ages);// [23, 7, 4]

        //Bir ArrayList'teki bir elemanın tüm görünümlerini nasıl sileriz ?
        List<String> citiesToRemove = new ArrayList<>();

        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities); //[Miami]


        //Kısa yoldan bir list oluşturmak için aşağıdaki List.of() methodu kullanılır.
        List<Character> initials = List.of('a', 'k', 'c', 'd', 'k');
        System.out.println(initials);//[a, k, c, d,k]

        List<Character> letters = List.of('a', 'c', 'k', 'd', 'k');
        System.out.println(letters);//[a, c, k, d, k]

        //İki ArrayList'in birbirine eşit olup olmadığını nasıl anlarız?
        //equals() methodu aynı elemanlar aynı index'te olduğu sürece true verir.
        boolean r1 = letters.equals(initials);
        System.out.println(r1);//false

        //indexOf('k') yazarsanız 'k'nın ilk görünümün index'ini verir.
        int r2 = initials.indexOf('k');
        System.out.println(r2);//1

        //lastIndexOf('k') yazarsanız 'k' nın son görünümünün index'ini verir.
        int r3 = initials.indexOf('k');
        System.out.println(r3);//1

        //Example 1: Bir Listteki tekrarsız elemanları console'a yadıran kodu yazınız.
        List<Double> prices = List.of(2.5, 1.25, 3.75, 1.25, 4.0);

        for (Double w : prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)) {
                System.out.print(w + " ");//2.5 3.75 4.0
            }
        }
        //Example 2:Bir List'te tekrarlı eleman olup olmadığını gösteren kodu yazınız
        List<Double> heights = List.of(1.25,3.75,1.25,4.0);

        int counter = 0;
        for (Double w : heights) {
            counter = 0;
            if (heights.indexOf(w) != heights.lastIndexOf(w)) {
                counter++;

            }
        }
        System.out.println();
        if (counter == 0) {
            System.out.println("All elements are unique in the list");
        } else {
            System.out.println("At least one element is not unique in the list");
        }


    }
}
