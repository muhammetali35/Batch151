package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanın array'de olup olmadığını anlamak için gereken kodu yazınız

        String names[] = {"K", "C", "R", "A", "S"};

        String el = "B";
        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println(" Array has the element " + el);
        } else {
            System.out.println("Array does not have the element " + el);
        }

        //2.way

        //1)binarySearch() methodunu sort() kullanmadan kullanmayınız çünkü binarySearch() mantığı sıralı elemanlar için geçerlidir.
        //2) binarySearch() method'u var olan elemanlar icin size o elemanin index'ini verir.
        //3) binarySearch() method'undan aldigniz index 0 veya 0'dan buyukse bu o eleman array'de var demektir.
        //4) binarySearch() methodu olmayan elemanlar için negatif tamsayı değeri verir.
        //"-" işaretinin anlamı o eleman yok demektir.
        //"sayi" ise o eleman olsaydı kaçıncı eleman olurdu demektir.


        Arrays.sort(names);

        int result = Arrays.binarySearch(names, el);//binarySearch() interviewlerde sorulabilir
        System.out.println(result);//0 (indexini veriyor)


        if (result < 0) {
            System.out.println(" Array has  " + el);
        } else {
            System.out.println("Array does not have  " + el);


        }
    }
}
