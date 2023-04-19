package karisiksorular;

import java.util.Scanner;

public class manavSepetiHesaplama {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Ürün Kg Fiyatları

Salatalık : 3,14 TL
Elma : 4,11 TL
Kabak : 2,22 TL
Domates: 0,95 TL
Patlıcan : 7,00 TL
         */

        Scanner input= new Scanner(System.in);


        System.out.println("Kaç kilo salatalık aldınız?");
        double salataKilo = input.nextDouble();

        System.out.println("Kaç kilo elma aldınız?");
        double elmaKilo = input.nextDouble();

        System.out.println("Kaç kilo kabak aldınız?");
        double kabakKilo = input.nextDouble();

        System.out.println("Kaç kilo domates aldınız?");
        double domatesKilo = input.nextDouble();

        System.out.println("Kaç kilo patlican aldınız?");
        double patlicanKilo = input.nextDouble();

        double salatalik= 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates= 0.95;
        double patlican= 7.00;

        double toplam=0.0;

        toplam+=salatalik*salataKilo;
        toplam+=elma*elmaKilo;
        toplam+=kabak*kabakKilo;
        toplam+=domates*domatesKilo;
        toplam+=patlican*patlicanKilo;

        System.out.println("Toplam: "+toplam+" TL");

       /* if (urun.equalsIgnoreCase("salatalık")){
            System.out.println("Fiyat: "+ (double)(salatalik*kilo));

        }else if (urun.equalsIgnoreCase("elma")){
            System.out.println("Fiyat: "+ (double)(elma*kilo));
        }else if (urun.equalsIgnoreCase("kabak")){
        System.out.println("Fiyat: "+ (double)(kabak*kilo));
        }else if (urun.equalsIgnoreCase("domates")){
        System.out.println("Fiyat: "+ (double)(domates*kilo));
        }else if (urun.equalsIgnoreCase("patlıcan")){
        System.out.println("Fiyat: "+ (double)(patlican*kilo));
        }else {
            System.out.println("Yanlış giriş yaptınız tekrar deneyiniz");
        }

*/






    }
}
