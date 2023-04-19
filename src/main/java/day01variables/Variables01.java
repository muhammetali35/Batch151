package day01variables;

public class Variables01 {
    public static void main(String[] args) {
        // Variable olusturma
        //data type+ variable name+ atama operatoru+ data +naktalı virgul
              int           age              =       13          ;

              // java cümlesi==> Statement
       /*  Data type+ variable name==> Variable Declaration
           Assignment Operator(atama operatoru)+ Variable değeri==> Assignment
           Eger variable Declaration yapar, assigment yapmazsanız
        java kendi degerlerini (default==> varsayılan) koyar
           Default degerler sayılar icin sifirdir.
           Dilbilgisinde ki nokta ne ise Java daki noktalı virgül aynı şeydir.
        ve statementin bittiğini gösterir.
           Java da esittir demek "==". Yani matematik te "=" , java da "=="

        */

        /*
        Java da temelde iki tip data vardir.
        1) Primitive data type:
        char, boolean, byte, short , int ,long, float, double
        2) non-primitive data type
        String
         */
        // örnek1: Ogrenci ismi icin variiable olusturup deger olarak Ali Can atayınız.

        String studentName= "Ali Can" ;


        //String bir variable olusturup ona her hangi bir atama yapmazsak java o variable a
        //default olarak "null" koyar
        //null demek 0 demek degil, 0 da coding te bir degerdir
        //null demek ici bos obje demektir.
        //yani icinde variable veya method bulunmayan default obje demektir
        // {}

        //char data type:
        //Tek karakterler icin kullanilir. ornegin ==> A, x, ?, 5
        //Ornek2 : char data type ında bir ismin ilk harfi olarak bir
        // variable olusturunuz ve bir deger atayiniz
        // Note: char data type ında degerler tek tirnak icin konulmalıdır.

        char isminIlkHarfi = 'A';

        // boolean data type :
        // Boolean lar sadece iki farkli deger alabilir; true(dogru) yada false(yanlıs)
        // Ornek3 : boolean data type ında emekli misin icin variable olusturun ve false degerini atayin

        boolean emekliMisin = false ;

        // byte data type
        // tam sayilar icindir hafızada 1 byte yer kaplar
        // byte: -128 den +127 ye kadar tamsayi değerleri icin kullanılabilir.Örn: yaşlar, sınıf mevcudu vs
        //Örnek4 : byte data type inda ogrenci yası icin bir variable oluşturup bir deger atayınız

        byte studentAge= 23;

        //short data type:
        // tam sayilar icindir hafizada 2 byte yer kaplar
        // short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir.
        // Ornek 5: Site nufusu icin bir variable olusturun ve deger atayınız.
        short siteNufusu= 1200;

        // int data type:
        // tam sayilar icindir hafizada 4 byte yer kaplar
        // int -2.147.483.648 ile 2.147.483.647 arasindaki sayilar icindir.
        // Ornek 6: Ulke nufusu icin bir variable olusturun ve deger atamsi yapiniz.
        int countryPopulation= 1764784515;

        // long data type:
        // tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9.223.372.036.854.775.808 ile -9.223.372.036.854.775.807 arasindaki sayilar icindir
        // Ornek 7: insan vucudundaki hücre sayisi icin variable olusturup deger ataması yapınız.
        // Note: Bir deger long ise sonuna "L"(tercih edilir) veya "l" konulur .
        long cellNumberInHumanBody = 8787878787878787L ;

        // Eger long' a atadiginiz deger intlerin araliginda ise sonuna "l" koymaya gerek yok.
        // long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder.

        long weightOfSun = 1345645L ;

        //float data type :
        // float data type Virgullu sayilar icin kullanılır.(Obdalıklı sayilar ==> Decimal Number)
        //float hafizada 4 byte yer kaplar
        //Note: Java ondalikli sayilari yani "Decimal Number" i otomatik olarak "double" kabul eder.
        //eger float data type olmassında ısrar ederseniz sonhuna "F" yada "f" koymalisiniz.

        // Orneğin fiyatlandırmalar icin tercih edilir(12.99)
        // Ornek 8: Gomlek ve ayakkabı fiyatlari için iki tane variable olusturup toplam fiyati ekrana yazdiriniz.

        float shirtPrice= 12.99F;
        float shoesPrice= 15.99f;

        System.out.println(shirtPrice+ shoesPrice);

       //double data type:
        // double data type virgllü sayilar icin kullanilir( Ondalikli sayilar==> Decimal Number)
        // double memory de daha fazla (8 byte) yer kaplar, virgülden sonraki rakam daha fazla alir
        //Ornek 9: Hucre agirligi ve Amipin agirligi icin iki tane variable olusturunuz ve agırlıkları farkını console yazdir.

        double weightCell= 0.0000000112;
        double weightAmip= 0.0000000023;
        System.out.println(weightCell-weightAmip);





    }
}
