package practices;

import java.util.Scanner;

public class Scanner02 {
    // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
    // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İsminizi ve soy isminizi giriniz");

        String isimSoyisim=input.nextLine().toUpperCase();

        char isimIlkKarakter= isimSoyisim.charAt(0);
        char soyisminIlkKarakter= isimSoyisim.charAt(isimSoyisim.indexOf(" ")+1);

        System.out.println(""+isimIlkKarakter+soyisminIlkKarakter);

    }
}
