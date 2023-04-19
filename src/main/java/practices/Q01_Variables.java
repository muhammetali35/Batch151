package practices;

public class Q01_Variables {
    public static void main(String[] args) {

        //Bir variable başlat
        int age = 15;
        int number = 43;
        String isim = "Ali";
        String isim2 = "Muhammet";

        System.out.println("isim = " + isim);//isim.soutv yaparsan bunu yazar
        System.out.println(age);
        System.out.println("age = " + age); //number.soutv yaparsan bunu yazar
        System.out.println("number: " + number);
        System.out.println("isim2 = " + isim2);

        //Variable değerini kopyala
        int myAge = age;
        System.out.println("myAge = " + myAge);

        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);


        // Ayni satirda çoklu variable deklere et
        int year = 2022, month = 3, day = 15, ornekNumber=1 ;
        System.out.println("month = " + month);
        System.out.println("year = " + year);
        System.out.println("ornekNumber = " + ornekNumber);

        //Bir variable değerini güncelleme

        year=2023;
        System.out.println("year = " + year);//2023

        year= 2030;
        System.out.println("year = " + year);//2030


        // Bir variable deklere et: x
        double x;

        // Baska bir variable baslat: y
        double y=55.6;

        //Baska bir variable baslat: z
        double z= 10;


        //x değişkenini başka bir değişken ile başlat
        x=y;

        //Variable'ı güncelle
        x=15.3;

        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }

}
