package karisiksorular;

import java.util.Scanner;

public class soru7manipulationsornekler {
    public static void main(String[] args) {
        /*
        Kullanıcıdan isim isteyin Eger
        -isim "a" harfi içeriyorsa "Girdiğiniz isim a harfi iceriyor"
        -isim "Z" harfi içeriyorsa "Girdiğiniz isim Z harfi iceriyor"
        -ikiside yoksa  "Girdiğiniz isim a veya Z harfi icermiyor" yazdırın
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz...");
        String isim= input.nextLine();

        if(isim.contains("a")){
            System.out.println("Girdiğiniz isim a harfi iceriyor");

        }else if(isim.contains("Z")){
            System.out.println("Girdiğiniz isim Z harfi iceriyor");

        }else {
            System.out.println("Girdiğiniz isim a veya Z harfi icermiyor");
        }
        // a ve Z harfinin ikisibide içeriyor'u yazdıramadım=====>Önemli

    }
}
