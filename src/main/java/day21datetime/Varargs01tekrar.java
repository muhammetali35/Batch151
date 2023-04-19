package day21datetime;

import java.util.Scanner;

public class Varargs01tekrar {

    //Java farklı sayıdaki parametrelrin hepsini kabul eden bir yapı oluşturdu.
    //Bu yapıya "Varargs" denir.
    //"Varargs" arkada "Array" yapısını kullanır

    /*
    1) Bir method'un içine birden fazla "Varargs" koyulamaz
    2)Bir method parantezi'nde bir'den fazla parametre kullanılacaksa "Varargs" en sonda olmalıdır.
     */

    //Example 1: Toplama işlemi yapan bir method oluştur?
    //Aşağıdaki gibi farklı method'lar oluşturarak iş yapamayız.
    //Çünkü kullanıcı farklı sayıdaki sayıları toplamak isteyebilir, her ihtimal için bir method oluşturmak mümkün değildir.


    public static void main(String[] args) {

        System.out.println(topla(4,5,2));//11
        System.out.println(topla(5,60));//65
        System.out.println(topla(-5,-13,5));//-13

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ismi giriniz");
        String isim=input.nextLine();
        initials(isim);
        initials("Muhammet Yılmaz","Ahmet Can");
    }

    public static int topla(int... a) {
        int sum = 0;
        for(int w : a){
            sum += w;
        }
        return sum;

    }
    //Example 2: Verilen isimlerin ilk harflerini console'a yazdıran method'u oluşturunuz
    // Ali Can ==> AC

        public static void initials(String...a){
        String initials="";
        for(String w: a){
            initials=initials+w.charAt(0)+ w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials="";
        }
        }





}
