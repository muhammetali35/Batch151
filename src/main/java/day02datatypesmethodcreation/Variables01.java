package day02datatypesmethodcreation;

public class Variables01 {

        /*
        Java'da temelde iki tip data type vardır.
        1) primitive data type:
        char, boolean, byte, short, int, long, float, double
        2)non-primitive data type:
        String
         */

        /*
        Note1: primitive data type' ları java olusturmustur, biz olusturamayız.
        Note2: primitive data type' ların isimlerinde sadece kucuk harf kullanılır.
        Note3: primitive data'lar type'larına göre memoryde farkli yer kaplarlar.
        Note4: primitive data'lar iclerinde sadece sizin atadıgınız degeri barindirirlar.
         */

        /*
        Non-primitive data types
        Ornek olarak String non-priimitive data type'dir.
        Uretilen her bir class ayni zamanda bir " non-primitive data type"dir.
        Bu yuzden "non-primitive data type" lar sinirsiz sayida dir denilebilir.
        Non-primitive data typeların isimleri buyuk harfle baslar.
        Non-primitive data typeların tamamı icin Java memoryde ayni miktarda yer ayirir.

         */

    public static void main(String[] args) {
        // Ornek1: Sehir ismi icin bir variable olusturun ve bir deger atayın ekrana yazdirin

        String cityName= "İzmir" ;
        System.out.println(cityName);

        /*
    Interview sorusu: "primitive" ile "non-primitive" data typelar arasındaki farklar nelerdir?
       1)"primitive" ler memory'de sadece bizim atadığımız değeri içerir.
          "non-primitive" ler memory'de bizim atadığımız değer ve method içerir.
       2)"primitive" ler kuçuk harfle baslar "non-primitive" ler ise buyuk harfle baslar.
       3)"primitive" leri Java uretmiştir ve 8 adettir.
        "non-primitive"leri ise Java ve developerlar üretebilir sınırsızdır.
       4)"primitive" ler memoryde data typeına göre yer kaplar.
         "non-primitive" data tyoeların tamami için Java memoryde ayni miktarda yer içerir.

         */


    }
}
