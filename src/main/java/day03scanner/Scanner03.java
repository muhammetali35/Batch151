package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanıcıdan adresini alınız ve ekrana yazdırın

        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz...");
        String address= input.nextLine();

        // next() metodu kullanıcıdan tek kelimeli String almak için kullanılır.
        // nextline() metodu kullanıcıdan çok String i almak için kullanılır

        System.out.println(address);


      /*   tekrarım
        Scanner input2= new Scanner(System.in);
        System.out.println("Lütfen ad ve soyadınızı giriniz");
        String isim= input2.nextLine();
        System.out.println(isim);*/



    }
}
