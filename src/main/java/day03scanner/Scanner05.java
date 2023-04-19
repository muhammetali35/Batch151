package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız.
        // i)Alanı hesapla
        //ii)Çevresini hesapla


        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz...");

        double shortSide= input.nextInt();
        double longSide= input.nextInt();

        double alan= shortSide*longSide;// Recommeded(tavsiye edilen)
        System.out.println("Dikdörtgenin alanı: "+alan);

        System.out.println("Dikdörtgenin çevresi: "+2*(shortSide+longSide));




    }
}
