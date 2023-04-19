package day03scanner;

import java.net.Socket;
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Kullanıcıdan ilk ismini ve soy ismini alıp ikisini aynı satırda ekrana yazdırın

        Scanner input= new Scanner(System.in);
        System.out.println("İlk isminizi giriniz...");
        String firstName= input.next();
        System.out.println("Soy isminizi giriniz...");
        String lastName= input.next();

        System.out.println(firstName+" "+lastName);


        /* tekrarım
        Scanner input2= new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        byte age= input2.nextByte();
        System.out.println("age = " + age);*/


    }
}
